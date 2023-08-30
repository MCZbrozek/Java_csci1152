import java.util.Scanner;

public class Part125Else
{
	public static void main(String[] args)
	{
		/* We've learned how to skip code using
		if, but what if we want to choose 
		between two options using code?
		     else
		*/
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter a negative to turn left, anything else to turn right: ");
		int val = input.nextInt();

		if(val < 0)
		{
			System.out.println("Turn left");
		}
		else //otherwise
		{
			System.out.println("Turn Right");
		}
		
		
		System.out.print("\nEnter a double: ");
		double money = input.nextDouble();
		if(money >= 1)
		{
			System.out.println("That's a dollar or more.");
		}
		else
		{
			System.out.println("That's less than a dollar, have some more.");
			money = money + 17.59;
			System.out.println(money);
		}
		
		if (20 > 18)
			System.out.println("20 is greater than 18");
		else
			System.out.println("20 is NOT greater than 18");
		
		input.close();
	}

}