import java.util.Scanner;

public class Part135ElseIf
{
	public static void main(String[] args)
	{
		/* if statements are for running or
		skipping some code.
		
		An if with an else if for choosing
		between two options.
		
		But what if we want more options
		depending on other conditions?
		For that there is "else if" */

		Scanner input = new Scanner(System.in);
		//https://www.w3schools.com/java/java_conditions.asp
		System.out.println("What time?");
		int time = input.nextInt();
		if (time < 10)
		{
			System.out.println("Good morning.");
		}
		else if (time < 20)
		{
			System.out.println("Good day.");
		}
		//No else. Might do nothing.

		System.out.println("\n=========================\n");

		System.out.println("What time?");
		time = input.nextInt();
		//Exactly one case is going to execute.
		if (time < 10) {
			System.out.println("Good morning.");
			time = 60;
		}
		else if (time < 20) {
			System.out.println("Good day.");
		}
		else if (time < 24) {
			System.out.println("Good evening.");
		}
		else if (time < 30) {
			System.out.println("What planet has these hours?");
		}
		//No last resort
		
		
		System.out.println("\n=========================\n");
		
		
		System.out.println("What time?");
		time = input.nextInt();
		//If I want more than one option to execute
		if (time < 24) {
			System.out.println("Good evening.");
		}
		if (time < 30) {
			System.out.println("What planet has these hours?");
		}
		//ifs are independent.
		//else if's and else's are connected
	}
}
