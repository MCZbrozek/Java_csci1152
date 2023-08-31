/* 
https://en.wikipedia.org/wiki/Time_complexity

LINEAR SEARCH
https://www.geeksforgeeks.org/linear-search/

size of the problem  	10		100		1000	n
worst case				10		100		1000	O(n) linear
best case				 1		  1		   1	O(1) constant
expected case			 5		 50		 500    O(n) linear

BINARY SEARCH
https://www.geeksforgeeks.org/binary-search/

size of the problem  	10		100		1000	n
worst case				~4~		~7~		~10~	O(log2(n)) logarithmic 
best case				 1		  1		   1	O(1) constant
expected case			~4~		~7~		~10~	O(log2(n)) logarithmic 


Fig. 19.4: BinarySearchTest.java
from the book.
Use binary search to locate an item in 
an array. */
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class Part538BinarySearch
{
	public static int binarySearchRecursive(int[] data, int key)
	{
		return binarySearchRecursive(data, key, 0, data.length-1);
	}
	
	
	// perform a binary search on the data		
	public static int binarySearchRecursive(int[] data, int key, int low, int high)
	{
		//Base case
		if (low > high)
			return -1;

		//Recursive case
		int middle = (low + high + 1) / 2;

		// print remaining elements of array
		System.out.print(remainingElements(data, low, high));
		// output spaces for alignment
		for (int i = 0; i < middle; i++)
			System.out.print("   ");
		// indicate current middle with *
		System.out.println(" * ");

		// if the element is found at the middle
		if (key == data[middle])
			return middle;
		// if the middle element is too high
		else if (key < data[middle])
			high = middle - 1;
		else  // middle element is too low
			low = middle + 1;

		return binarySearchRecursive(data, key, low, high);
	} // end method binarySearch
	
	
	// perform a binary search on the data
	// iteratively
	public static int binarySearch(int[] data, int key)
	{
		int low = 0;
		int high = data.length - 1;
		int middle = (low + high + 1) / 2;
		int location = -1;
		
		do
		{
			// print remaining elements of array
			System.out.print(remainingElements(data, low, high));
			
			// output spaces for alignment
			for (int i = 0; i < middle; i++)
				System.out.print("   ");
			// indicate current middle with *
			System.out.println(" * ");

			// if the element is found at the middle
			if (key == data[middle])
				location = middle;
			// if the middle element is too high
			else if (key < data[middle])
				high = middle - 1;
			else  // middle element is too low
				low = middle + 1;

			middle = (low + high + 1) / 2;
		} while ((low <= high) && (location == -1));

		return location;
	} // end method binarySearch


	// method to output certain values in array
	private static String remainingElements(int[] data, int low, int high)
	{
		StringBuilder temporary = new StringBuilder();

		// append spaces for alignment
		for (int i = 0; i < low; i++)
			temporary.append("   ");

		// append elements left in array 
		for (int i = low; i <= high; i++)
			temporary.append(data[i] + " ");

		return String.format("%s%n", temporary);
	} // end method remainingElements


	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		SecureRandom generator = new SecureRandom();

		int[] data = new int[15]; // create array

		for (int i = 0; i < data.length; i++) // populate array
			data[i] = 10 + generator.nextInt(90);

		Arrays.sort(data); // binarySearch requires sorted array
		System.out.printf("%s%n%n", Arrays.toString(data)); // display array

		// get input from user
		System.out.print("Please enter an integer value (-1 to quit): ");
		int searchInt = input.nextInt(); 

		// repeatedly input an integer; -1 terminates the program
		while (searchInt != -1)
		{
			// perform search
			//int location = binarySearch(data, searchInt);
			int location = binarySearchRecursive(data, searchInt);

			if (location == -1) // not found
				System.out.printf("%d was not found%n%n", searchInt); 
			else // found
				System.out.printf("%d was found in position %d%n%n", 
					searchInt, location);

			// get input from user
			System.out.print("Please enter an integer value (-1 to quit): ");
			searchInt = input.nextInt();
		} 
	} // end main

} // end class BinarySearch


/**********************************************
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
 ***********************************************/