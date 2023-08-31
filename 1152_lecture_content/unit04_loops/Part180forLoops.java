/* Fig. 4.2: ForCounter.java from the book
Counter-controlled repetition with the
for repetition statement.

Also known simply as a for loop.

Also includes Fig. 4.5: Sum.java from the book:
Summing integers with the for statement.
*/
public class Part180forLoops
{
	public static void main(String[] args)
	{
		// for loop header includes initialization,
		// loop-continuation condition and increment
		for (int counter=0; counter<10; counter++)
		{
			System.out.printf("%d  ", counter);
		}
		System.out.println("\n");
		
		
		
		int total = 0;
		// total even integers from 2 through 20
		for (int number=2; number<=20; number+=2)
		{
			total = total + number;
		}
		System.out.printf("Sum is %d\n", total);


		/* TODO: Write a for loop that prints out
		every whole number from 7 through 22. */
		
	}
} // end class


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