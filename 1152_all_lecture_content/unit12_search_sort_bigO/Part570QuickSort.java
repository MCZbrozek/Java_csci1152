// Source:
// https://www.youtube.com/watch?v=h8eyY7dIiN4
import java.security.SecureRandom;
import java.util.Arrays;

public class Part570QuickSort
{
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int partition(int[] arr, int low, int high)
	{
		// pivot (Element to be placed at right position)
		int pivot = arr[high];
	 
		//Index between lows and unknowns
		int low_index = low;
		//Index between highs and unknowns
		int high_index = (high - 1);

		while(low_index < high_index)
		{
			// While current low-index element is smaller than the pivot...
			while (arr[low_index] <= pivot && low_index < high_index)
			{	//...move low_index up
				low_index++;
			}
			// While current high-index element is greater than or equal to the pivot...
			while (arr[high_index] >= pivot && low_index < high_index)
			{	//...move high_index down
				high_index--;
			}
			//At this point, low_index points to a value that should be above the pivot
			//and high_index points to a value that should be below, so swap them.
			swap(arr, low_index, high_index);
		}
		//Move the pivot into position.
		//there is an edge case where the low-index is still higher then the pivot because the first index
		//acessed is higher. This fixes that edge case. 
		if (arr[low_index] > arr[high]){
			swap(arr, low_index, high);
		}
		else{
			low_index = high;
		}
		return low_index;
	}


	public static void displaySortProgress(int[] data, int low, int middle, int high)
	{
		// print remaining elements of array
		System.out.print(remainingElements(data, low, high));
		// output spaces for alignment
		for (int i = 0; i < middle; i++)
			System.out.print("   ");
		System.out.println(" * "); // indicate current middle
	}


	public static void quicksort(int[] data)
	{
		//displaySortProgress(data, 0, data.length-1, data.length-1);
		
		quicksort(data, 0, data.length-1);
	}
	
	// perform a binary search on the data		
	public static void quicksort(int[] data, int low, int high)
	{
		//Base case
		if (low >= high)
			return;

		//Recursive case
		int pivot_index = partition(data, low, high);

		//displaySortProgress(data, low, pivot_index, high);

		quicksort(data, low, pivot_index-1);
		quicksort(data, pivot_index+1, high);
	}
	
	
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
		SecureRandom generator = new SecureRandom();

		int[] data = new int[15];
		for (int i = 0; i < data.length; i++)
			data[i] = 10 + generator.nextInt(90);

		System.out.println("Array before sorting:");
		System.out.printf("%s%n%n", Arrays.toString(data));

		quicksort(data);

		System.out.println("Array after sorting:");
		System.out.printf("%s%n%n", Arrays.toString(data));
	} // end main
}