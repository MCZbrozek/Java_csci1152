/* This is an example from the book:
Fig. 6.6: BarChart.java
Bar chart printing program. */
public class Part260BarChart
{
	public static void main(String[] args)
	{
		int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

		System.out.println("Grade distribution:");

		// for each array element, output a bar of the chart
		for (int lcv = 0; lcv < array.length; lcv++)
		{
			// output bar label ("00-09: ", ..., "90-99: ", "100: ")
			if (lcv == 10)
				System.out.printf("%5d: ", 100); 
			else
				System.out.printf("%02d-%02d: ", 
					lcv * 10, lcv * 10 + 9); 
 
			// print bar of asterisks
			for (int stars = 0; stars < array[lcv]; stars++)
				System.out.print("*");

			System.out.println();
		}
	}
} // end class

/*********************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and *
 * Pearson Education, Inc. All Rights Reserved. * * *
 * DISCLAIMER: The authors and publisher of this book have used their *
 * best efforts in preparing the book. These efforts include the *
 * development, research, and testing of the theories and programs *
 * to determine their effectiveness. The authors and publisher make *
 * no warranty of any kind, expressed or implied, with regard to these *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or *
 * consequential damages in connection with, or arising out of, the *
 * furnishing, performance, or use of these programs. *
 ********************************************************/
