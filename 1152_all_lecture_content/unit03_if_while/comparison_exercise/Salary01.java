import java.util.Scanner;

public class Salary01 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		double monthlySales = 0, income = 0;

        System.out.println("Enter the value of monthly sales: ");
        monthlySales = input.nextDouble();

        if (monthlySales >= 50000.00)
			income = 575.00 + .16 * monthlySales;
		else if (monthlySales >= 40000.00)
			income = 550.00 + .14 * monthlySales;
		else if (monthlySales >= 30000.00)
			income = 525.00 + .12 * monthlySales;
		else if (monthlySales >= 20000.00)
			income = 500.00 + .09 * monthlySales;
		else if (monthlySales >= 10000.00)
			income = 450.00 + .05 * monthlySales;
		else
			income = 400.00 + .03 * monthlySales;

		System.out.printf("%s: %.2f%n", "The income is",income);
    }
}