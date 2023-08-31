public class Part380Exercises
{
	public static void main(String[] args)
	{
		/* TODO: Follow along as we write a for
		loop to copy the values	from A into B. */
		int A[] = {7,36,3,0,5,4,3,6,8,6};
		int B[] = new int[10];
		
		printArray(B);
		System.out.println("\n==================\n");
		
		
		/*TODO: Write code to copy only the first
		three values from the array named "from"
		to the array named "to". Use as few numbers
		in your code as possible.
		Use from.length or to.length as needed. */
		int from[] = {5,9,3,7,2,6};
		int to[] = new int[3];
		
		printArray(to);
		System.out.println("\n==================\n");
		
		
		/* TODO: Write code to copy only the LAST
		three values from the array named "source"
		to the array named "destination". Use as
		few numbers in your code as possible. */
		int source[] = {5,9,3,7,2,6};
		int destination[] = new int[3];
		
		printArray(destination);
		System.out.println("\n==================\n");
		
		
		/* TODO: Start with an array of these
		values 1, 2, 3, 4, 5 and copy them in
		reverse order to a new array so the new
		array ends up like this: 5, 4, 3, 2, 1 */
		
		
		System.out.println("\n==================\n");
		
		
		/* TODO: Start with an array of these
		values 1, 2, 3, 0, 0, 0
		Use a for loop to copy the first three
		values in reverse order to the end of the
		array so you end up with this:
		1, 2, 3, 3, 2, 1 */
		
		
	}
	
	
	public static void printArray(int[] array)
	{
		for(int i=0; i<array.length; i++)
		{
			System.out.printf("%5d", array[i]);
		}
	}
}
