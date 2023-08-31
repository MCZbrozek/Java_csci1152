
public class Part150ConditionErrors
{
	public static void main(String[] args)
	{
		/* The following program illustrates
		some common mistakes involved with if,
		else if, and else. */
		
		int x = 3;
		
		if(x<5); //BROKEN. Never put semicolons after if statements.
		{
			System.out.println("Good morning.");
		}
		else; //BROKEN. No semicolon here either
		{
			System.out.println("Good day.");
		}


		if(x<5)
		{
			System.out.println("Good morning.");
		}
		else (x<10) //BROKEN. Did you mean to use else if? No condition on an else.
		{
			System.out.println("Good day.");
		}

	}
}
