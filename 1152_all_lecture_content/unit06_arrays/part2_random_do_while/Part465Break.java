/* The following example is a combination of
Fig. 4.11: BreakTest.java
and
Fig. 4.12: ContinueTest.java
from the book with modifications.

"break" and "continue" are special commands
that can be used to alter or interrupt the
flow of any type of loop.
*/
public class Part465Break
{
	public static void main(String[] args)
	{
		// The loop control variable is declared
		// here so it will be in scope after the
		// loop.
		int count;
		//Break example
		for (count = 1; count <= 10; count++)
		{  
			if (count == 5)
			{
				break; //terminates loop if count is 5
			}
			System.out.printf("%3d", count);
		}
		System.out.printf("  Broke out of loop at count = %d%n%n", count);
		
		
		//Continue Example
		for (int i=1; i<=10; i++)
		{
			if (i == 5)
			{
				continue; // skips remaining code in loop body if i is 5
			}
			System.out.printf("%3d", i);
		}
		System.out.printf("  Used continue to skip printing 5%n%n");
	}
} // end class

/**********************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and
 * Pearson Education, Inc. All Rights Reserved.
 * DISCLAIMER: The authors and publisher of this book have used their	  *
 * best efforts in preparing the book. These efforts include the			 *
 * development, research, and testing of the theories and programs *
 * to determine their effectiveness. The authors and publisher make		 *
 * no warranty of any kind, expressed or implied, with regard to these	 *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or		 *
 * consequential damages in connection with, or arising out of, the		 *
 * furnishing, performance, or use of these programs.*
 **********************************************************/
