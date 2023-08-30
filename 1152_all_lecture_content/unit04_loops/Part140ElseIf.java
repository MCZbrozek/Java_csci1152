import java.util.Scanner;

public class Part140ElseIf
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter age 1:");
		int age1 = input.nextInt();
		System.out.print("Enter age 2:");
		int age2 = input.nextInt();
		System.out.print("Enter age 3:");
		int age3 = input.nextInt();
		
		if(age1 > age2 && age2 > age3)
		{
			System.out.println("age2 is in the middle");
		}
		
		if(age2>age1 || age2>age3)
		{
			System.out.println("age2 is not youngest");
		}
		else if(age2>age3)
		{
			/* TODO: Are there any possible values
			the ages can have that will cause this
			to print? Answer in a comment. */
			System.out.println("age2 is older than age3");
		}
		else if(age1>age3)
		{
			/* TODO: Are there any possible values
			the ages can have that will cause this
			to print? Answer in a comment. */
			System.out.println("What can we say about the ages?");
		}
		else //instead or otherwise
		{
			/* TODO: What values could the ages be
			to make this print? Answer in a comment. */
			System.out.println("What do we know?");
		}
		
		//Stuff that happens regardless should
		//go outside of ifs, else-ifs, or else's
		//curly brackets.
		System.out.println("Done");
	}
}
