import java.util.Scanner;

/* Source: Exercise 3.6: Calculate.java
 in "Java How to Program, Late Objects Version, Eleven Edition, Paul Deitel & Harvey Deitel"
Modified by Neal Holtschulte.
*/
public class Part070While
{
	public static void main(String[] args)
	{
		/* A while loop has the exact same setup
		as an if statement, but uses the word while
		instead of if.
		
		The code inside an if executes 0 or 1 times.
		The code inside a while executes 0 or more
		times. */
		
		// Calculate the sum of the integers from 1 to 10
		int sum = 0;
		int x = 1;
		// while x is less than or equal to 10
		while (x <= 10)
		{
			sum = sum + x; // add x to sum
			x = x+1; // increment x
		}
		System.out.println("The sum is: "+sum);
		

		System.out.println("\n=========================\n");

		
		//While loops are more commonly used when
		//we don't know how many times we need to
		//repeat.
		Scanner input = new Scanner(System.in);
		System.out.println("Keep going? yes/no");
		String response = input.nextLine();
		while( response.equals("yes") )
		{
			System.out.println("Keep going? yes/no");
			response = input.nextLine();
		}
		input.close();
		
		
		System.out.println("\n=========================\n");


		/* TODO: Uncomment the following, then fill
		in the blanks to write a while loop that adds
		together odd numbers until they total more 
		than 55. */
		/*
		int total = 0;
		int odds = 1;
		while(________)
		{
			total = total + ________;
			odds = odds + ________;
		}
		System.out.println("More than 55: "+total);
		*/
		
		
		System.out.println("\n=========================\n");


		/* TODO: Uncomment the following, then fill
		in the blanks to write a while loop that
		multiplies numbers until they total more 
		than 9999. */
		/*
		int total2 = 1;
		int count = 1;
		while(________)
		{
			total2 = total2 * ________;
			count = ___________;
		}
		System.out.println("More than 9999: "+total2);
		*/
	}
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
