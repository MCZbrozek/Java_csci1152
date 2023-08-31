/* Counting how many values in an array have
a particular property, or finding the max or
min value in an array requires a loop with
an if. */
public class Part255LoopAndIf
{
	public static void main(String[] args)
	{
		//The following loop counts how many
		//values are greater than one in the
		//array
		int values[] = {8,2,-5,1,4,-4,3,-6,1,-9,-1,2};
		int count = 0;
		for(int i = 0; i<values.length; i++)
		{
			if(values[i] > 1)
			{
				count++;
			}
		}
		System.out.println("\nThere are "+count+" values greater than one in the array.");
		
		
		/* TODO: Write a for loop that counts
		how many values in the above array are
		less than zero or greater than three.
		Don't forget to reset count to zero. */
		
		
		System.out.println("\nThere are "+count+" values less than zero or greater than three.");
		
		
		/* The following code identifies the
		maximum value in the array. */
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<values.length; i++)
		{
			if(max < values[i])
			{
				max = values[i];
			}
		}
		System.out.println("\nThe maximum value in the array is "+max);
		
		/* The following code identifies the
		minimum value in the array and the 
		position at which it occurs. */
		int min = Integer.MAX_VALUE;
		int index_of_min = -1;
		for(int i = 0; i<values.length; i++)
		{
			if(values[i] < min)
			{
				min = values[i];
				index_of_min = i;
			}
		}
		System.out.println("The minimum value in the array is "+min+", occurring at index "+index_of_min);
	}
}