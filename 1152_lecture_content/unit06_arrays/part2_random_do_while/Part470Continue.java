/* Break and continue should
 - Only* ever be used inside loops.
 - Inside a loop, break or continue should
 further be inside the body of a condition
 such as an if statement.

*break also gets used with switches.

*/
import java.util.Scanner;

public class Part470Continue
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String c = null;
		
		//Break Example
		do
		{
			System.out.print("Enter a value. If it's valid, the logarithm of your value will be computed:");
			double d = input.nextDouble();
			if(d <= 0)
				break; //No second chances
			d = Math.log(d);
			System.out.printf("The logarithm of your value is %f\n",d);
			System.out.print("Would you like to continue? y/n");
			c = input.next();
		}while(c.equals("y"));
		
		System.out.println("\nMoving on to second loop.\n");
		
		//Continue Example
		c = "y";
		do
		{
			System.out.print("Enter a value. If it's valid, the logarithm of your value will be computed:");
			double d = input.nextDouble();
			if(d <= 0)
			{
				System.out.println("Try again with a positive number.");
				continue;
			}
			d = Math.log(d);
			System.out.printf("The logarithm of your value is %f\n",d);
			System.out.print("Would you like to continue? y/n");
			c = input.next();
		}while(c.equals("y"));
	}
} // end class
