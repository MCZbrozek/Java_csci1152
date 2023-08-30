/* This is the classic high low guessing game,
but with a limited number of guesses. */
import java.util.Scanner;
import java.util.Random;

public class Part480HighLowFor
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int secret_number = rand.nextInt(100)+1;

		System.out.println("Guess my secret number between 1 and 100");
		int guess = input.nextInt();
		
		//Limited guesses
		int guess_count;
		for(guess_count=4; guess_count > 0; guess_count--)
		{
			if(guess > secret_number)
			{
				System.out.println("Too high");
			}
			else if(guess < secret_number)
			{
				System.out.println("Too low");
			}
			else //guessed correctly
			{
				break;
			}
			System.out.print("Guess again. You have "+guess_count+" guesses remaining: ");
			guess = input.nextInt();
		}
		
		if(guess_count > 0)
			System.out.print("You got it!");
		else
			System.out.print("You are out of guesses!");
	} // end of main
}