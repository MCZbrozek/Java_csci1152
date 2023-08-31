/* The use of variables is essential for
writing general and adaptable code. */
public class Part375ArrayGenerality
{
	public static void main(String[] args)
	{
		int[] numbers = getNumbers();
		
		printArray();
		
		//Swapping the second and fourth values
		numbers[1] = 15;
		numbers[3] = 999;
		System.out.println("\n  Just swapped:");
		printArray(numbers);

		System.out.println("\n  They are swapped, right?");
		printArray();

		numbers = getNumbers(); //reset numbers

		//Swapping the second and fourth values
		int temp = numbers[1];
		numbers[1] = numbers[3];
		numbers[3] = temp;
		System.out.println("\n  Just swapped:");
		printArray(numbers);

		numbers = getNumbers(); //reset numbers

		//Swapping the second and fourth values
		int i = 1;
		int j = 3;
		temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
		System.out.println("\n  Just swapped:");
		printArray(numbers);

		numbers = getNumbers(); //reset numbers

		//Swapping the second and fourth values
		swap(numbers);
		System.out.println("\n  Just swapped:");
		printArray(numbers);

		numbers = getNumbers(); //reset numbers

		//Swapping the second and fourth values
		swap(numbers, 1, 3);
		System.out.println("\n  Just swapped:");
		printArray(numbers);

		numbers = getNumbers(); //reset numbers

		//Swapping the fourth and second values
		swap(numbers, j, i);
		System.out.println("\n  Just swapped:");
		printArray(numbers);

	}
	
	public static int[] getNumbers()
	{
		int[] numbers = {10, 999, 30, 15};
		return numbers;
	}
	
	public static void printArray()
	{
		System.out.println("  Value at "+0+" is "+10);
		System.out.println("  Value at "+1+" is "+999);
		System.out.println("  Value at "+2+" is "+30);
		System.out.println("  Value at "+3+" is "+15);
	}

	public static void printArray(int[] array)
	{
		for(int i=0; i<array.length; i++)
		{
			System.out.println("  Value at "+i+" is "+array[i]);
		}
	}

	public static void swap(int[] array)
	{
		int temp = array[1];
		array[1] = array[3];
		array[3] = temp;
	}

	public static void swap(int[] array, int i, int j)
	{
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
