/* This example comes from the book
Fig. 4.7: DoWhileTest.java
do...while repetition statement.

We've learned about for loops and we've
learned about while loops, but there is also
the do-while loop.

Do-while is basically a while loop that
always executes at least once.
*/
public class Part445DoWhile
{  
	public static void main(String[] args)
	{
		//If we uncomment the next line,
		//the loop will still execute:
		//int counter = 100;
		int counter = 1;

		do
		{	//Run at least once
			System.out.printf("%4d", counter);
			++counter;
		} while (counter <= 10); // end do while
		
		System.out.printf("\n After Loop: %4d\n", counter);
	}
} // end class

/***********************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and*
 * Pearson Education, Inc. All Rights Reserved.*
 **
 * DISCLAIMER: The authors and publisher of this book have used their  *
 * best efforts in preparing the book. These efforts include the *
 * development, research, and testing of the theories and programs  *
 * to determine their effectiveness. The authors and publisher make *
 * no warranty of any kind, expressed or implied, with regard to these *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or *
 * consequential damages in connection with, or arising out of, the *
 * furnishing, performance, or use of these programs.*
 ******************************************************/
