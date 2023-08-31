/*
In this version, sortArray is RECURSIVE rather than ITERATIVE

This is based on the book code, but with some 
modifications made for readability.

Fig. 19.6: MergeSortTestR.java
Sorting an array with merge sort.
*/
import java.security.SecureRandom;
import java.util.Arrays;

public class Part565MergeSortRecur
{
	// calls recursive split method to begin merge sorting
	public static void mergeSort(int[] data)
	{
		sortArray(data, 0, data.length - 1);
	}

	// splits array, sorts subarrays and merges
	// subarrays into sorted array
	private static void sortArray(int[] data, int low, int high)
	{
		if (low < high) // if not base case
		{
			// calculate middle of array
			int middle1 = (low + high) / 2;
			// calculate next element from middle
			int middle2 = middle1 + 1;

			// split array in half; sort each half 
			// (these are the recursive calls)
			sortArray(data, low, middle1); // first half
			sortArray(data, middle2, high); // second half

			// merge two sorted arrays
			merge(data, low, middle1, middle2, high);
		} // end if
		else{
			//do nothing: base case
		}
	} // end method sortArray

	// merge two sorted subarrays into one 
	// sorted subarray				 
	private static void merge(int[] data, 
		int left, int middle1, int middle2, int right)
	{
		int leftIndex = left;//index into left subarray
		int rightIndex = middle2;//index into right subarray
		int combinedIndex = left;//index into temporary working array
		
		// temporary working array
		int[] combined = new int[data.length];
		
		// merge arrays until reaching end of either
		while (leftIndex <= middle1 && rightIndex <= right)
		{
			// place smaller of two current elements
			// into result and move to next space in
			// arrays
			if (data[leftIndex] <= data[rightIndex])
			{
				combined[combinedIndex] = data[leftIndex];
				leftIndex++;
			} else
			{
				combined[combinedIndex] = data[rightIndex];
				rightIndex++;
			}
			combinedIndex++;
		}

		// if left array is empty
		if (leftIndex == middle2) {
			// copy in rest of right array
			while (rightIndex <= right) {
				combined[combinedIndex] = data[rightIndex];
				combinedIndex++;
				rightIndex++;
			}
		} else {// right array is empty
			// copy in rest of left array
			while (leftIndex <= middle1) {
				combined[combinedIndex] = data[leftIndex];
				combinedIndex++;
				leftIndex++;
			}
		}
		
		// copy values back into original array
		for (int i = left; i <= right; i++)
			data[i] = combined[i];
	} // end method merge


	public static void main(String[] args)
	{
		SecureRandom generator = new SecureRandom();

		int[] data = new int[10];
		for (int i = 0; i < data.length; i++)
			data[i] = 10 + generator.nextInt(90);

		System.out.printf("Unsorted array:%n%s%n%n", 
			Arrays.toString(data)); // display array
		
		mergeSort(data); // sort array

		System.out.printf("Sorted array:%n%s%n%n", 
			Arrays.toString(data)); // display array
	}

} // end class MergeSortTest

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
********************************************************/