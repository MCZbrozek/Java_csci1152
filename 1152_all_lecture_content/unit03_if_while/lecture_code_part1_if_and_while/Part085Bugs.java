public class Part085Bugs
{
	public static void main(String[] args)
	{
		// Getting to know (and fixing) if and
		// while errors:


		/* Missing and mismatched brackets will 
		haunt you now and forever.
		TODO: Uncomment and then fix the 
		bug in the following. */
		/*
		char letter = 'B';
		if(letter == 'R') {
			System.out.println("That's an R!");
		*/
		

		System.out.println("\n=========================\n");


		/* Semicolons should NOT appear after
		if or while.
		TODO: Answer in a comment what happens when the 
		following code runs and what should happen. */
		int x = 10;
		if(x < 0); //<---This is wrong
		{
			System.out.println("x is a negative number");
		}
		
		
		System.out.println("\n=========================\n");


		//TODO: Fix the problem with the following code.
		System.out.println("Countdown:");
		while(x > 0);
		{
			System.out.println(x);
			x = x-1;
		}
		
		
		System.out.println("\n=========================\n");


		/* The word "until" is often implemented
		incorrectly using while loops.
		Remember this: until will always be used 
		with "not" which Java writes as an 
		exclamation point !
		
		For example: The following code loops as
		long as x is not one.
		Same as looping until x is one. */
		x = 7;
		while(x != 1) //until x == 1
		{
			System.out.println(x);
			if(x%2==0) //if x is even
			{
				x = x/2; //integer division
			}
			else //x is odd
			{
				x = 3*x + 1;
			}
		}
		System.out.println("Made it to the end. x should be 1. Here's x: "+x);
		
		
		System.out.println("\n=========================\n");
		
		
		/* TODO: Uncomment and fill in the blank in
		the following code so that the while loop 
		repeats until x is zero. */
		x = 5000;
		//while(_______)
		{
			System.out.println(x);
			x = x/2;
		}
		System.out.println("Made it to the end. x should be zero. Here's x: "+x);


		System.out.println("\n=========================\n");


		/* While loops can repeat forever, but can be
		interrupted by pressing
		    Control - c
		TODO: Uncomment the following. Run the code
		and interrupt it. Finally, fix the
		"infnite loop" bug by changing x+1;
		inside of the loop. */
		/*
		x = 0;
		while(x < 10)
		{
			System.out.println(x);
			x+1;
		}
		*/
	} 
}
