/* Source:
Fig. 2.15: Comparison.java in "Java How to Program, Late Objects Version, Eleven Edition, Paul Deitel & Harvey
Deitel"
Modified by Neal Holtschulte.
Compare integers using if statements, relational 
operators and equality operators.
*/
import java.util.Scanner; // program uses class Scanner

public class Part055IfInput
{

	// main method begins execution of Java application
	public static void main(String[] args)
	{
		// create Scanner to obtain input from command line
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: "); // prompt
		int number1 = input.nextInt(); // read first number from user

		System.out.print("Enter second integer: "); // prompt
		int number2 = input.nextInt(); // read second number from user
		
		//TODO: What does the following line of code print?
		//Answer in a comment.
		//System.out.println(number1 == number2);

		if (number1 == number2) {
			System.out.printf("%d == %d%n", number1, number2);
		}
		
		//I prefer the following curly bracket
		//formatting.
		if (number1 != number2)
		{
			System.out.printf("%d != %d%n", number1, number2);
		}
		
		//Curly brackets are technically optional
		//when there's only one line of code after
		//the if, but this is a BAD PRACTICE.
		if (number1 < number2)
			System.out.printf("%d < %d%n", number1, number2);

		/* TODO: What is a combination of inputs 
		that will make the following condition 
		true? Answer in a comment. */
		if (number1 > number2)
		{
			System.out.printf("%d > %d%n", number1, number2);
			System.out.println("Curly brackets are mandatory if more than one line of code is to be grouped inside the if.");
		}
		
		if (number1 <= number2)
			System.out.printf("%d <= %d%n", number1, number2);

		if (number1 >= number2)
			System.out.printf("%d >= %d%n", number1, number2);

	} // end method main
}

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and					*
 * Pearson Education, Inc. All Rights Reserved.									*
 *																								*
 * DISCLAIMER: The authors and publisher of this book have used their	  *
 * best efforts in preparing the book. These efforts include the			 *
 * development, research, and testing of the theories and programs		  *
 * to determine their effectiveness. The authors and publisher make		 *
 * no warranty of any kind, expressed or implied, with regard to these	 *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or		 *
 * consequential damages in connection with, or arising out of, the		 *
 * furnishing, performance, or use of these programs.							*
 *************************************************************************/
