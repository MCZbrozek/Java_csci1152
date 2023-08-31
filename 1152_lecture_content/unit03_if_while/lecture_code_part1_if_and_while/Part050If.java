public class Part050If
{
	public static void main(String[] args)
	{
		/* An if statement can be used to execute
		or skip a block of code based on whether
		a CONDITION is true or false. */
		//Web Source:
		//tutorialspoint.com/java/if_statement_in_java.htm
		int x = 10;
		if( x < 20 ) {
			System.out.println("This is an if example");
		}
		
		//Web Source:
		//w3schools.com/java/java_conditions.asp
		x = 20;
		int y = 18;
		if (x > y)
		{
			System.out.println("x is greater than y");
		}
		
		if(y == 999)
		{
			System.out.println("This code will not print.");
		}
		
		//TODO: Change the values of x and y so that
		//the following condition is true and the
		//code inside the if statement does execute.
	
		if(x <= y)
		{
			System.out.println("This code will not print.");
		}	
	}
}
