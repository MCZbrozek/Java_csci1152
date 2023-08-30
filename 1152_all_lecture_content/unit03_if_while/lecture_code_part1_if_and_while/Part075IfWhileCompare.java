import java.util.Scanner;

public class Part075IfWhileCompare
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Give me a number: x = ");
		int x = input.nextInt();
		System.out.print("Give me another number: y = ");
		int y = input.nextInt();
		
		//TODO: On the next line, write if with the 
		//condition that x is greater than y.

		{
			System.out.println("x is greater than y");
			y = y*2;
			System.out.println("so y has been doubled");
		}
		
		System.out.println();
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println();
		
		//TODO: On the next line, write while with 
		//the condition that x is greater than y.

		{
			System.out.println("x is STILL greater than y");
			y = y+1;
			System.out.println("so y has been incremented");
		}

		System.out.println();
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println();
	}
}
