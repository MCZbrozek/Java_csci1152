/* Source: Exercise 3.16: Mystery.java
 in "Java How to Program, Late Objects Version, Eleven Edition, Paul Deitel & Harvey Deitel"
Modified by Neal Holtschulte.
*/
public class Part080WhileMystery
{
	/* TODO: Read the following code, then use print 
	statements and experimentation to determine what 
	sort of total is printed at the end. Answer in a 
	comment. */
	public static void main(String[] args)
	{
		int x = 1;
		int total = 0;

		while (x <= 10) 
		{
			int y = x * x;
			System.out.println(y);
			total += y; // TODO: What does += do? Answer in a comment.
			x++; // TODO: What does ++ do? Answer in a comment.
		} 

		System.out.printf("Total is %d%n", total);
	} 
} // end class Mystery


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
