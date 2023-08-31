/* Think of arrays as fixed length lists of
values. We will study arrays in great detail
later, but since for loops and arrays go
hand in hand, I want to show a preview of
arrays now.

The following content comes from chapter 6 in
the book, figures:
  Fig. 6.2: InitArray.java - Initializing the elements of an array to default values of zero.
  Fig. 6.3: InitArray.java - Initializing the elements of an array with an array initializer.
with modifications
*/
import java.util.Scanner;

public class Part220Arrays
{
	public static void main(String[] args)
	{
		//Fig. 6.2
		// declare variable array and initialize
		// it with an array object
		int[] array = new int[10];

		System.out.printf("%s%8s%n", "Index", "Value");
	
		// output each array element's value
		for (int i = 0; i < array.length; i++)
		{
			System.out.printf("%5d%8d%n", i, array[i]);
		}
		

		System.out.println("\n=======================\n");


		//Fig. 6.3
		// initializer list specifies the initial
		// value for each element
		int[] values = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

		System.out.printf("%s%8s%n", "Index", "Value");
	
		// output each array element's value 
		for (int i = 0; i < values.length; i++)
		{
			System.out.printf("%5d%8d%n", i, values[i]);
		}
		

		System.out.println("\n=======================\n");


		// Populate array values using Scanner
		// then print them out.
		final int ARRAY_LENGTH = 5;
		int[] user_numbers = new int[ARRAY_LENGTH];
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<ARRAY_LENGTH; i++)
		{
			System.out.print("Enter a number: ");
			user_numbers[i] = input.nextInt();
		}
		input.close();
		
		System.out.printf("%s%8s%n", "Index", "Value");
		// output each array element's value
		for(int i = 0; i < user_numbers.length; i++)
		{
			System.out.printf("%5d%8d%n", i, user_numbers[i]);
		}
		
		
		System.out.println("\n=======================\n");


		//Sum up all the values entered by the user
		int total = 0;
		for(int i = 0; i < user_numbers.length; i++)
		{
			total += user_numbers[i];
			//Same as
			//total = total + user_numbers[i];
		}
		System.out.printf("Total of array elements: %d\n", total);
		
		/* STUDENT: Declare a new array large
		enough to hold 100 integers. */

		/* STUDENT: Declare a new array large
		enough to hold 30 doubles. */

		/* STUDENT: Declare a new array and
		initialize it holding a few of your
		favorite numbers. */

	} // end main
} // end class
