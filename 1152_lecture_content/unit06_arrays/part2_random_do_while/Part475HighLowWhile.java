/* This is the classic high low guessing game. */
import java.util.Scanner;
import java.util.Random;

public class Part475HighLowWhile
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int secret_number = rand.nextInt(100)+1;

		System.out.println("Guess my secret number between 1 and 100");
		int guess = input.nextInt();
		while(guess != secret_number) //continue as long as the guesser is wrong
		{
			if(guess > secret_number)
			{
				System.out.println("Too high");
			}
			else if(guess < secret_number)
			{
				System.out.println("Too low");
			}
			else
			{
				continue; //Can be continue or a break
			}
			System.out.print("Guess again: ");
			guess = input.nextInt();
		} //while
		System.out.print("You got it!");
		input.close();
	} // end of main
}
