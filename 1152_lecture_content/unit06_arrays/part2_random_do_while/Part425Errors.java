/* When dealing with arrays, your most common
error will likely be the array out of bounds
errors. */
import java.util.Scanner;
import java.security.SecureRandom;

public class Part425Errors
{
	public static void main(String[] args)
	{
		//Generate an array of random numbers
		//with a length and maximum value
		//chosen by the user.
		Scanner input = new Scanner(System.in);
		SecureRandom randomNumbers = new SecureRandom();
		
		System.out.print("How many numbers: ");
		final int SIZE = input.nextInt();
		
		System.out.print("Enter the maximum random value: ");
		final int MAX = input.nextInt();
		
		int randValues[] = new int[SIZE];
		//Populate the array
		for(int i=0; i<SIZE; i++)
		{
			randValues[i] = randomNumbers.nextInt(MAX);
		}
		
		
		//Prompt the user for the position of a
		//particular number to display
		int response = 0;
		while(response != -1)
		{
			System.out.print("Enter an index to display or -1 to continue: ");
			response = input.nextInt();
			System.out.printf("%d is the value at position %d\n", randValues[response], response);
		}
		
		/* TODO: What error occurs in the above
		code when the user enters -2 or another
		index that is beyond the bounds of the 
		array? Answer in a comment, then fix the 
		code so that it is protected against 
		accidental user errors. */
		
		input.close();
	}
}
