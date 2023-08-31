/* Arrays are not PRIMITIVE. Arrays are
passed to methods by reference, not by
value. This means that any changes the
method makes are reflected in the original
array! */
public class Part400PassByReference
{
	public static void main(String[] args)
	{
		double[] mainArray = {1.0, 2.0, 3.0};

		System.out.println("mainArray at index 0 = "+mainArray[0]);
		System.out.println("mainArray at index 1 = "+mainArray[1]);
		System.out.println("mainArray at index 2 = "+mainArray[2]);

		modifyArray(mainArray);
		
		System.out.println();
		
		System.out.println("mainArray at index 0 = "+mainArray[0]);
		System.out.println("mainArray at index 1 = "+mainArray[1]);
		System.out.println("mainArray at index 2 = "+mainArray[2]);
		
		
		/* TODO Write a method that takes a double
		array as input. The method doesn't return 
		anything, but the method should divide
		every value in its input array by two.
		Call the method and print out the result
		to verify that it works. */
		
	}

	public static void modifyArray(double[] methodArray)
	{
		methodArray[0] = 91.0;
		methodArray[1] = 92.0;
		methodArray[2] = 93.0;
	}
}