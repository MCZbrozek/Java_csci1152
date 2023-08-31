/* Fig. 2.7: Addition.java from the textbook (with modifications)
This is an addition program that displays the sum of two numbers typed in by the user.

Basic text user interaction can be handled
by a Scanner, a built-in Java class.
Use "import" to get access to the Scanner: */
import java.util.Scanner;

public class Part030Input
{
	public static void main(String[] args)
	{
		/* Create a Scanner-type variable
		named input and put into memory all
		the information needed to "scan".
		Scanner is a new type of variable!
		*/
		Scanner input = new Scanner(System.in);

		// Prompt the user using standard printing commands
		System.out.print("Enter first integer: ");
		/* Read first number from the user 
		and put it into a new int variable
		named number1. */
		int number1 = input.nextInt();
		/* This part  input.nextInt()  is a
		method call. It's a way of requesting
		an action from the Scanner.
		Not all variable types support this
		type of interaction. */
		
		/* TODO: What happens if you try to 
		get nextInt from a type that doesn't 
		support the method? Put the name and 
		description of the error in a comment 
		here: */
		int x = 3;
		//number1 = x.nextInt();
		
		System.out.print("Enter second integer: "); // prompt
		int number2 = input.nextInt(); // read second number from user

		int sum = number1 + number2; // add numbers, then store total in sum

		System.out.println("The sum is "+sum); // display sum

		input.close(); //Close your Scanner!
		//Some versions of Java complain if you don't.

	} // end method main
} // end class Addition
