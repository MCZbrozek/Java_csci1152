/* Fig. 19.5: InsertionSortTest.java
Sorting an array with insertion sort.
Guarantees that values on the left side
of the array are in order amongst
themselves. */
import java.security.SecureRandom;
import java.util.Arrays;

public class Part545InsertionSort
{
	// sort array using insertion sort
	public static void insertionSort(int[] data)
	{
		// loop over data.length - 1 elements
		for (int next = 1; next < data.length; next++)
		{
			int insert = data[next]; // value to insert
			int moveItem = next; // location to place element

			// search for place to put current element
			while (moveItem > 0 && data[moveItem - 1] > insert)
			{
				// shift element right one slot
				data[moveItem] = data[moveItem - 1];
				moveItem--;
			}

			data[moveItem] = insert; // place inserted element
			printPass(data, next, moveItem); // output pass of algorithm
		}
	}

	// print a pass of the algorithm
	public static void printPass(int[] data, int pass, int index)
	{
		System.out.printf("after pass %2d: ", pass);

		// output elements till swapped item
		for (int i = 0; i < index; i++)
			System.out.printf("%d  ", data[i]);

		System.out.printf("%d* ", data[index]); // indicate swap

		// finish outputting array
		for (int i = index + 1; i < data.length; i++)
			System.out.printf("%d  ", data[i]);

		System.out.printf("%n%15s"," "); // for alignment

		// indicate amount of array that�s sorted
		for(int i = 0; i <= pass; i++)
			System.out.print("--  ");
		System.out.println();
	}

	public static void main(String[] args)
	{
		SecureRandom generator = new SecureRandom();

		int[] data = new int[10];
		for (int i = 0; i < data.length; i++)
			data[i] = 10 + generator.nextInt(90);

		System.out.printf("Unsorted array:%n%s%n%n", 
			Arrays.toString(data)); // display array
		insertionSort(data); // sort array

		System.out.printf("Sorted array:%n%s%n%n", 
			Arrays.toString(data)); // display array
	}
} // end class InsertionSort


/*********************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and
 * Pearson Education, Inc. All Rights Reserved.
 * DISCLAIMER: The authors and publisher of this book have used their	  *
 * best efforts in preparing the book. These efforts include the			 *
 * development, research, and testing of the theories and programs		  *
 * to determine their effectiveness. The authors and publisher make		 *
 * no warranty of any kind, expressed or implied, with regard to these	 *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or		 *
 * consequential damages in connection with, or arising out of, the		 *
 * furnishing, performance, or use of these programs.
 *********************************************************/