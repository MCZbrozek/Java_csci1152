/* The book makes a bigger deal about
"counter-controlled" loops versus
"signal-controlled" loops than I am
interested in, but I'll talk about it
here briefly. */
import java.util.Scanner;

public class Part455DoWhile
{
	public static void main(String[] args)
	{
		/* Counter Controlled While Example
		What matters for this is the counting
		(counting down in this case) not the
		name of the variable. */
		int counter = 10;
		while (counter >= 0)
		{
			System.out.println("counter = " + counter);
			counter--;
		}
		System.out.printf("Counter final value = %d\n\n",counter);
		
		//Counter Controlled Do-While Example
		counter  = -1;
		//A "repeat at least once" loop
		do
		{
			System.out.println("counter = " + counter);
			counter--;
		} while (counter >= 0);
		System.out.printf("Counter final value = %d\n\n",counter);
		
		
		System.out.println("\n\n");
		
		
		//Signal Controlled While Example
		//Notice the absence of counting.
		Scanner sc = new Scanner(System.in);
		boolean done = false;
		while (!done)
		{
			System.out.println(" not done");
			System.out.print("Continue y/n ?");
			done =   "n".equals(sc.next());
		}
		System.out.println("Done with signal controlled loop.\n");
		
		
		//Signal Controlled Do-While Example
		boolean valid_row = false;
		int row;
		//Classic use for do-while is validating user input
		do {
			System.out.print("Give me the tic tac toe row: ");
			row = sc.nextInt();
			valid_row = 1<=row && row<=3;
		} while (!valid_row);
		System.out.println("Done with signal controlled loop.");
		
		
		//Alternative do-while with fewer variables
		int row;
		//Classic use for do-while is validating user input
		do {
			System.out.print("Give me the tic tac toe row: ");
			row = sc.nextInt();
		} while ( !(1<=row && row<=3) );
		System.out.println("Done with signal controlled loop.");
	}
}
