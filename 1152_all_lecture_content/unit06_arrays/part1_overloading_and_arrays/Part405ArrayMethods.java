/* Here is an example of a variety of
array methods. */
public class Part405ArrayMethods
{

	public static void main(String[] args)
	{
		int[] c = {-45,6,0,72,1543,-89,0,62,-3,1,6453,78};
		
		double ave = findAverage(c);
		System.out.println("\naverage = " + ave);
		
		swap(1, 10, c);
		System.out.println("\nHere's the array after swapping the values at indexes 1 and 10. The average should not be affected.");
		printArray(c);
		
		ave = findAverage(c);
		System.out.println("average = " + ave);
		
		swap(5,6,c);
		System.out.println("\nHere's the array after swapping the values at indexes 5 and 6. The average should not be affected.");
		printArray(c);
		
		ave = findAverage(c);
		System.out.println("average = " + ave);
		
		
		System.out.println("\nThere's a big difference between printing out an array variable name compared to printing out each element of the array.");
		System.out.println("c = " +c);
		printArray(c);
		
		System.out.println("\nHere's the biggest value in the array.");
		int biggest = findMax(c);
		System.out.println("biggest = " + biggest);

		System.out.println("\nHere's the smallest value in the array.");
		int smallest = findMin(c);
		System.out.println("smallest = " + smallest);
		
		
		System.out.println("\nHere's an example of modular arithmetic to repeat an ascending count.");
		twoLoopsRound(c);
	}
	
	public static void printArray(int[] arr) {
		for (int i=0; i < arr.length; i++) {
			System.out.printf("%4d", arr[i]);
		}
		System.out.println();
	}

	public static int findMax(int[] arr) {
		int max_so_far = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max_so_far) {
				max_so_far = arr[i];
			}
		}
		return max_so_far;
	}
	
	public static int findMin(int[] arr)
	{
		int min_so_far = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < min_so_far) {
				min_so_far = arr[i];
			}
		}
		return min_so_far;
	}
	
	public static void swap(int i1, int i2, int[] arr)
	{
		int temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
	}
	
	public static double findAverage(int[] arr) {
		double sum = 0;
		for (int i=0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum/arr.length;
	}
	
	/* While using a for loop, is it possible
	to get back to the starting index while
	ascending? */
	public static void twoLoopsRound(int[] c)
	{
		int double_length = c.length * 2;
		int index;
		for(int i = 0; i<double_length; i++)
		{
			index = i % c.length; //remainder
			System.out.printf("%5d %5d %5d\n", i, c[index], index);
		}
	}
	
	
}