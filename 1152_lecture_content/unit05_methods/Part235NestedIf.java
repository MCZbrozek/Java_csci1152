//Source: https://www.javatpoint.com/java-if-else
import java.util.Scanner;

public class Part235NestedIf
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What time?");
		int time = input.nextInt();
		
		/* Most code structures can be nested
		inside other code structures with a few
		exceptions.
		
		Do not attempt to declare methods or 
		classes inside the curly brackets of 
		other code structures. See note below. */
		if(time < 5)
		{
			System.out.println("Too early for me.");
		}
		else if (time < 10)
		{
			System.out.println("Good morning.");
		}
		else if (time < 20)
		{
			System.out.println("Good day.");
		}
	} // end main
	
	//New methods can be declared here.
	
} // end class

