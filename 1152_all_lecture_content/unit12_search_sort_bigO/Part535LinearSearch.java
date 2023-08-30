/* The following program is similar to 
Fig. 19.2: LinearSearchTest.java
which comes from the book and was seen
earlier as Part415LinearSearch.java
*/
import java.security.SecureRandom;
import java.util.Scanner;

public class Part535LinearSearch
{
	public static void main(String[] args)
	{
		SecureRandom generator = new SecureRandom();

		System.out.printf("\nHere's an array of random values between 10 and 100.");
		int[] data = new int[10];
		for (int i = 0; i < data.length; i++)
		{
			data[i] = 10 + generator.nextInt(90);
			System.out.printf("%5d", data[i]);
		}
		
		System.out.print("Enter a number to search for: ");
		Scanner input = new Scanner(System.in);
		int searchInt = input.nextInt();
		input.close();

		int position = linearSearch(data, searchInt);

		if (position == -1)
		{
			System.out.printf("%d was not found\n\n", searchInt); 
		}
		else
		{
			System.out.printf("%d was found in position %d\n\n", searchInt, position);
		}
	} // end main
	
	
	public static int linearSearch(int data[], int searchKey)
	{
		int comparisonCount = 0;
		for (int i=0; i<data.length; i++)
		{
			comparisonCount++;
			if (data[i] == searchKey)
			{
				System.out.println(comparisonCount+" comparisons were made during this search.");
				return i;
			}
		}
		System.out.println(comparisonCount+" comparisons were made during this search.");
		return -1; // integer was not found
	}

}