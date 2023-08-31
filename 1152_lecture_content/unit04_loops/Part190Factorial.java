import java.util.Scanner;

public class Part190Factorial
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Give me an integer to calculate the factorial of: ");
		int factorial = input.nextInt();
		
		int result;
		result = factorial*(factorial-1);
		result = result*(factorial-2);
		result = result*(factorial-3);
		result = result*(factorial-4);
		
		System.out.println("My answer is " + result);
		System.out.println("If your input was \"5\" or \"6\" then I got it right.");
		
		
		//Here's the better way to do it.
		int accumulator = 1;
		for(int x=factorial; x>1; x--)
		{
			accumulator = accumulator*x;
			
			System.out.printf("x is %d. accumulator is %d\n",x,accumulator);
		}
		System.out.print("The factorial of your number is "+accumulator);
		
		
		input.close();
	}
} // end class
