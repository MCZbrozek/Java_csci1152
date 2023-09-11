// Name: Michael Zbrozek
// Class: 1152:101
// Assignment: Week2: Income Tax
// Purpose: Calculate a Tax Bill
// FileName: "IncomeTax.java"

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        // Create scanner variable
        Scanner input = new Scanner(System.in);

        // Welcome the user
        System.out.println("  Welcome to Turtle Tax -".toUpperCase());
        System.out.println("    We have till April 15th!\n    What's the rush? \\_(*-*)_/ \n ");

        // Print a prompt for the user to enter # of exemptions - as int (all other
        // variables are double)
        System.out.print("Please enter the number of exemptions you wish to claim: ");
        int exemptions = input.nextInt();

        // Print a prompt that asks the user for their gross salary as a dollar value
        System.out.print("Please enter your Gross Salary: ");
        double grossSalary = input.nextDouble();

        // Print a prompt that asks the user for their interest income as a dollar value
        System.out.print("Please enter your Interest Income: ");
        double interestIncome = input.nextDouble();

        // Print a prompt that asks the user for their capital gains income as a dollar
        // value
        System.out.print("Please enter any Capital Gains Income: ");
        double capGains = input.nextDouble();

        // Print a prompt that asks the user for their charitable contributions as a
        // dollar
        // value
        System.out.print("Please enter the value of your Charitable Contributions: ");
        double charity = input.nextDouble();

        // Perform the calculation of total income
        // Total income = Gross Salary + Interest Income + Capital Gains
        double totalIncome = grossSalary + interestIncome + capGains;
        System.out.println(totalIncome);

        // Perform the calculation of adjusted income
        // Adjusted income = Total Income - (Number of exemptions * 1500.00) -
        // charitable contributions
        double adjustedIncome = totalIncome - (exemptions * 1500.00) - charity;
        System.out.println(adjustedIncome);

        // initialize variable for total tax
        double totalTax;

        // Perform the calculation of total tax (use if and else statements)
        // 0% paid on Adjusted Income less than or equal to $10,000
        // 15% paid on Adjusted Income above $10,000 and less than or equal to $32,000
        // 23% paid on Adjusted Income above $32,000 and less than or equal to $50,000
        // 28% paid of Adjusted Income above $50,000
        if (adjustedIncome >= 50000) {
            totalTax = ((adjustedIncome - 50000) * .28) + (18000 * 0.23) + (22000 * 0.15);
        } else if (adjustedIncome >= 32000) {
            totalTax = ((adjustedIncome - 32000) * 0.23) + (22000 * 0.15);
        } else if (adjustedIncome >= 10000) {
            totalTax = ((adjustedIncome - 10000) * 0.15);
        } else {
            totalTax = 0;
        }
        ;

        // Frame the receipt output
        System.out.printf("--------------------------------------%n");
        System.out.println("Your tax information\nis summarized below:");
        System.out.printf("--------------------------------------%n");
        // Print out total income, adjusted gross income and total tax with $$ to two
        // decimal places
        System.out.printf("Total Income:" + "%10s" + "%,15.2f %n", "$", totalIncome);
        System.out.printf("Adjusted Income:" + "%7s" + "%,15.2f %n", "$", adjustedIncome);
        System.out.printf("Total Tax:" + "%13s" + "%,15.2f %n", "$", totalTax);
        System.out.printf("--------------------------------------%n");

        // Close input
        input.close();
    }
}
