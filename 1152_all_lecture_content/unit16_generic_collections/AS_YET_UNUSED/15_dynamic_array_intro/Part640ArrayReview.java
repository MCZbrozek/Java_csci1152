
public class IntArrayReview
{
	public static void main(String[] args)
	{
		//Review of integer arrays
		int[] numbers = {2,6,12,3,7,8,3,3,7,12,3};
		
		int m = getMax(numbers);
		System.out.printf("%-30s %3d\n", "The maximum value is ", m);
		
		int max_index = getMaxIndex(numbers);
		System.out.printf("%-30s %3d\n", "The index of max is ", max_index);
		
		max_index = getLastMaxIndex(numbers);
		System.out.printf("%-30s %3d\n", "The last index of max is ", max_index);
		
		max_index = getLastMaxIndexAlt(numbers);
		System.out.printf("%-30s %3d\n", "The last index of max is ", max_index);
	}

	//Find and return the maximum value
	public static int getMax(int[] array)
	{
		int max_so_far = array[0];
		for (int i=1; i<array.length; i++)
		{
			if (max_so_far < array[i])
			{
				max_so_far = array[i];
			}
		}
		return max_so_far;
	}

	//Find and return the index of the first copy of the maximum value
	public static int getMaxIndex(int[] array)
	{
		int index = 0;
		int max_so_far = array[index];
		for (int i=1; i<array.length; i++)
		{
			if (max_so_far < array[i])
			{
				max_so_far = array[i];
				index = i;
			}
		}
		return index;
	}
	

	//Find and return the index of the last copy of the maximum value
	public static int getLastMaxIndex(int[] array)
	{
		int index = array.length-1;
		int max_so_far = array[index];
		for (int i=array.length-2; i>=0; i--)
		{
			if (max_so_far < array[i])
			{
				max_so_far = array[i];
				index = i;
			}
		}
		return index;
	}

	//An alternative method of finding and returning the index of the last copy of the maximum value
	public static int getLastMaxIndexAlt(int[] array)
	{
		int index = 0;
		int max_so_far = array[index];
		for (int i=1; i<array.length; i++)
		{
			if (max_so_far <= array[i])
			{
				max_so_far = array[i];
				index = i;
			}
		}
		return index;
	}
}
