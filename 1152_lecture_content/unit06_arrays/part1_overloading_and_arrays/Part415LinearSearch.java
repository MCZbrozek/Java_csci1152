/* The following program comes from the book:
Fig. 19.2: LinearSearchTest.java
Sequentially searching an array for an item.

Searching through data for a value is a
common issue. The simplest approach is to
start at the beginning and compare each value
in order to what you're looking for.

On average this takes n/2 comparisons where
n is the total amount of data.

Computer scientists have a special notation
known as Big O notation to represent such
things. In terms of Big O notation, an
average of n/2 procedures is summarized as
Order n, or linear, and is written O(n).

All linear algorithms are O(n) including
3*n,   n/1000,   12*n+1000000

O(n) is a "ballpark" metric and it also
ignores the actual runtime of the algorithm
focusing solely on number of repeated steps.
*/

//A random number generator for
//"populating" the array:
import java.security.SecureRandom;
//Used for convenient array printing:
import java.util.Arrays;
//Used for user interaction:
import java.util.Scanner;

public class Part415LinearSearch
{
	// perform a linear search on the data
	public static int linearSearch(int data[], int searchKey)
	{	// loop through array sequentially
		for (int index = 0; index < data.length; index++)
		{
			if (data[index] == searchKey)
				return index; // return index of integer
		}
		return -1; // integer was not found
	} // end method linearSearch

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		SecureRandom generator = new SecureRandom();

		int[] data = new int[10]; // create array

		// populate array
		for (int i = 0; i < data.length; i++)
			data[i] = 10 + generator.nextInt(90);
		
		// display array
		System.out.printf("%s%n%n", Arrays.toString(data));

		// get input from user
		System.out.print("Please enter an integer value (-1 to quit): ");
		int searchInt = input.nextInt();

		// repeatedly input an integer;
		//-1 terminates the program
		while (searchInt != -1)
		{
			// perform search
			int position = linearSearch(data, searchInt);
			
			if (position == -1) // not found
				System.out.printf("%d was not found%n%n", searchInt); 
			else // found
				System.out.printf("%d was found in position %d%n%n", searchInt, position);
			
			// get input from user
			System.out.print("Please enter an integer value (-1 to quit): ");
			searchInt = input.nextInt();
		} 
	} // end main
} // end class Part415LinearSearch


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
