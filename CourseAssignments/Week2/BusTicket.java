// Name: Michael Zbrozek
// Class: 1152:101
// Assignment: Week2: Bus Ticket
// Purpose: Determine the type of ticket the user is purchasing.
// FileName: "BusTicket.java"

// ** Criteria ** //
// Senior Ticket age greater than or equal to 65
// Adult Ticket age greater than or equal to 18
// Child’s Ticket age less than 18

import java.util.Scanner;

public class BusTicket {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Ask user for their name
        System.out.println("Welcom to the Bus Station. What is your name? ");
        String userName = input.nextLine();
        // Ask the user for their age
        System.out.println("Hello, " + userName + "!" + " How old are you? ");
        int userAge = input.nextInt();

        // Create a variable called ticketType
        String ticketType;

        // Evaluate the age vs the criteria to select the correct bus ticket
        if (userAge >= 65) {
            ticketType = "Senior Ticket";
        } else if (userAge >= 18) {
            ticketType = "Adult Ticket";
        } else {
            ticketType = "Child Ticket";
        }
        ;

        // Say something clever to the customer -
        if (ticketType == "Child Ticket") {
            System.out.println("You must be accompanied by an adult to purchase a " + ticketType + "."
                    + " Please find an adult so we can sell more tickets!");
        } else {
            // Print out the result in the form: "The Answer is: "+myAnswer
            System.out.println("Your bus ticket is: " + ticketType);
        }
        ;
        // Close input
        input.close();
    }
}