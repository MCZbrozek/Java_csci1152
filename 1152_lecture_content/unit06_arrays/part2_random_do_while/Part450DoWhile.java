import java.util.Scanner;

public class Part450DoWhile
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int x;
		do {
			System.out.print("Enter number: ");
			x = input.nextInt();
			System.out.println("x = " + x);
		} while(x != -1);
		/* Notice the semicolon on the previous
		line of code. It's a bit weird.
		Do-while loops are the only loops
		that end in a semicolon. */
		
		
		/* The following while loop is identical
		to the above do-while loop. The only
		thing that's not ideal about the 
		following is that the integer has to be
		given a value for the sole purpose of
		sneaking past the condition x != 1 and
		into the loop. This can lead to mistakes
		and bad data. */
		int y = 0;
		while (y != -1)
		{
			System.out.println("y = " + y);

			System.out.print("Enter number: ");
			y = input.nextInt();
		}
		
		input.close();
	}

}
