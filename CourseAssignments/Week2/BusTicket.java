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
        Scanner inputAge = new Scanner(System.in);

        // Ask the user for their age
        System.out.println("Hello. What is your age? ");
        int userAge = inputAge.nextInt();

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
        // Print out the result in the form: "The Answer is: "+myAnswer
        System.out.println("Your bus ticket is: " + ticketType);
    }
}