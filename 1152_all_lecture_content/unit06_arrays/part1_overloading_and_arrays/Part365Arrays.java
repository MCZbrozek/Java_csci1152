import java.util.Scanner;

public class Part365Arrays
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to search for: ");
		int search = sc.nextInt();
		sc.close();
		
		//How to determine if a number is 
		//found in an array or not.
		int[] numbers = {3, 5, 7, 8, 0, 10, 3, 4};
		boolean isFound = false;
		for(int i=0; i < numbers.length; i++)
		{
			if(search == numbers[i])
			{
				//found number
				isFound = true;
				break; //End the loop early
			}
		}
		System.out.println("Was found? "+ isFound);
		
		
		isFound = valueFoundInArray(search, numbers);
		System.out.println("Was found? "+ isFound);
	}
	
	
	/* This is how to determine if the value
	is in the array with a method. */
	public static boolean valueFoundInArray(int needle, int[] haystack)
	{
		for(int i=0; i < haystack.length; i++)
		{
			if(needle == haystack[i])
			{
				return true;
			}
		}
		return false;
	}
}
