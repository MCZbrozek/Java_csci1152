import java.util.Scanner;

public class Part155PosNegZero
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer:");
		int x = input.nextInt();

		/* TODO: Write a program using if,
		else if, else to check if x is positive,
		negative, or zero. Use the following
		code to print out the status of x. */
		System.out.println("number is positive");
		System.out.println("number is negative");
		System.out.println("number is zero");
		
		/* TODO: Write a separate if and else
		statement to check if x is odd or even.
		The following expression will be true if
		x is even:
		x % 2 == 0
		Print statements are also provided. */
		System.out.println("number is even");
		System.out.println("number is odd");
	}
}
