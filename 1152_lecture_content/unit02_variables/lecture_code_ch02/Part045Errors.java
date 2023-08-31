public class Part020Errors
{
	public static void main(String[] args)
	{
		/* TODO: Once declared, it is incorrect
		to declare a variable again.
		x has been declared (and initialized)
		below. Declare an integer variable named
		x again. Then recompile. You will get an error.
		Copy the text of the error here into this 
		comment, then comment out the re-declaration
		so that the program compiles. */
		int x = 5492;

		
		/* TODO: Typos are one of the most common
		errors. What is the error message that 
		displays when you uncomment the line of
		code below with the typo? Answer in this 
		comment. then comment out the mistake
		so that the program compiles. */
		double volume = 6.82396;
		//volume = voluem*2;

		/* TODO: Sometimes you simply forget to 
		declare a variable. The error message 
		that displays when you uncomment the 
		line of code below is the same as the
		previous error. Why? Answer in this 
		comment: */
		//value = 386 - 10*4*4;

		/* TODO: Assignment is not reversible.
		What error do you get when you uncomment
		the line below? */
		double delta;
		delta = 5.3; //Perfectly fine
		//5.3 = delta; //Wrong!
		
		//Likewise:
		int y = 4;
		int z = 10;
		//y+z = x; //Wrong
		//TODO: write the line of code that correctly
		//sets x equal to y+z
		
		/* Lastly, multiplication is never 
		assumed like it is in math class. In math,
		this  4/6(3-2)  means
		four divided by six times (three minus two).
		TODO: What error does the next line of code 
		cause? */
		//z = 4/6(3-2);

		//TODO: Fix the line so that it works correctly.
		
	}
}
