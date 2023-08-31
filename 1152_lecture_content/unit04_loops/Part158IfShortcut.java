/* This code shows a short way to write if
statements. I will never test you on this.
I consider this an advanced technique only
for people who are already very confident
with ALL the basics. */
import java.util.Scanner;

public class Part158IfShortcut
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//https://www.w3schools.com/java/java_conditions.asp
		System.out.println("What time?");
		int time = input.nextInt();
		
		//Short Hand (Don't do this. It's just a 
		//fancy short if-else statement.)
		
		//Source: https://www.w3schools.com/java/java_conditions.asp
		String result = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(result);

		// The above is equivalent to the code below
		String result;
		if (time < 18) {
			result = "Good day.";
		} else {
			result = "Good evening.";
		}
		System.out.println(result);
	}

}