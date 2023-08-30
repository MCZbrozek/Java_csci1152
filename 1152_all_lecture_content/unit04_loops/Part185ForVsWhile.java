import java.util.Scanner;

public class Part185ForVsWhile
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Give me an integer to count up to: ");
		int limit = input.nextInt();
		
		// Use for loops for counting and also when 
		// you know how many times you want to repeat.
		// i is our LCV (loop control variable)
		for(int i=0; i<limit; i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();


		// Use while loop when you don't know how
		// many times you want to repeat
		int i=0;
		while(i<limit)
		{
			System.out.print(i+" ");
			i++;
		}
		
		input.close();
	}
} // end class
