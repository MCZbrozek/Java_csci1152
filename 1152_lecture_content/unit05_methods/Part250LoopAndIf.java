/* Conditions are common in while loops as
well as for loops. */
public class Part250LoopAndIf
{
	public static void main(String[] args)
	{
		//The following code prints all the
		//odd fibonacci numbers up to 1000
		int a = 1;
		int b = 1;
		int temp;
		while(a < 1000)
		{
			if(a%2==1)
			{
				System.out.printf("%5d", a);
			}
			//The following calculation
			//requires a third variable:
			temp = a;
			a = b;
			b = temp + b;
		}
		
		System.out.println("\n========================\n");
		
		//This example prints out the first 10
		//solutions to x^2 + 3^2 = 4^2 modulus 5
		//(3^2)%5 == 1
		//(4^2)%5 == 1
		int count = 0;
		int x = 0;
		while(count < 10)
		{
			if((x*x)%5 + 1 == 1)
			{
				System.out.printf("%5d", x);
				count++;
			}
			x++;
		}
		
		System.out.println("\n========================\n");
		
		/* TODO: Write a while loop that starts
		counting at 1 and goes up by 1 and sums
		up factors of 3 or 5 until the sum is
		greater than 100.
		Print out the growing sum along the way. */
		
		
	}
}