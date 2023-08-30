/* The following comes from Fig. 3.6: ClassAverage.java
in the book, with modifications.

Solving the class-average problem using 
counter-controlled repetition. */
import java.util.Scanner;

public class Part210ClassAverage
{
	public static void main(String[] args)
	{
		// create Scanner to obtain input from
		// command window
		Scanner input = new Scanner(System.in);

		// initialize sum of grades entered by the user
		int total = 0;
		// initialize # of grade to be entered next
		int gradeCounter = 1;
	
		// processing phase uses counter-controlled 
		// repetition
		/* TODO: write a while statement that
		repeats as long as gradeCounter is less
		than or equal to 5. Write it on the very
		next line. */

		{
			System.out.print("Enter grade: "); // prompt 
			int grade = input.nextInt(); // input next grade
			total = total + grade; // add grade to total
			gradeCounter = gradeCounter + 1; // increment counter by 1
		}
	
		/* TODO: What variable is no longer in
		scope? Answer in a comment. */
		
		// integer division yields integer result.
		// Apparently we don't want any remainder
		//for some reason.
		int average = total / 5;

		// display total and average of grades
		System.out.printf("%nTotal of all 5 grades is %d%n", total);
		System.out.printf("Class average is %d%n", average);
	} // end  main
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