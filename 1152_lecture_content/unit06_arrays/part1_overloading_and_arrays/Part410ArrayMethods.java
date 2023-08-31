import java.util.Scanner;

public class Part410ArrayMethods
{
	public static void main(String[] args)
	{
		int stats[] = {9,23,52,85,32,85,92,15,85,93,72,11};
		int target = 85;
		
		//Is the value contained in the array at
		//least once?
		boolean valuePresent = hasValue(target, stats);
		System.out.println("Is "+target+" among the statistics? "+valuePresent);
		
		//Where is the first instance of the
		//value in the array?
		int position = getFirstIndexOf(target, stats);
		System.out.println("The first example of "+target+" occurs at "+position);
		
		/* TODO: Fill in the countOccurrences
		method below to count how many times the
		target value is found in the array. Then
		call the method here and display your
		results. */
		
		
		//Where are all instances of the value
		//in the array? In other words, find
		//all the indexes.
		int[] indexes = getAllIndexesOf(target, stats);
		System.out.print(target+" occurs at all of the following positions: ");
		for(int i : indexes)
		{
			System.out.printf("%5d",i);
		}
	}
	
	public static boolean hasValue(int value, int[] array)
	{
		for(int i=0; i<array.length; i++)
		{
			if(array[i] == value)
			{
				return true;
			}
		}
		return false;
	}
	
	public static int getFirstIndexOf(int value, int[] array)
	{
		for(int i=0; i<array.length; i++)
		{
			if(array[i] == value)
			{
				return i;
			}
		}
		//Something must be returned if the value
		//is not found.
		return -1;
	}
	
	public static int countOccurrences(int value, int[] array)
	{
		return -1; //This is a placeholder. Delete
		//and replace it.
	}
	
	public static int[] getAllIndexesOf(int value, int[] array)
	{
		int count = countOccurrences(value, array);
		int indexes[] = new int[count];
		int position = 0;
		for(int i=0; i<array.length; i++)
		{
			if(array[i] == value)
			{
				indexes[position] = i;
				position++;
			}
		}
		return indexes;
	}
} // end class

