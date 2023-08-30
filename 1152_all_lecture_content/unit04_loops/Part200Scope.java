
public class Part200Scope
{
	public static void main(String[] args)
	{
		/* Variables are only accessible in
		certain contexts known as scope.
		The scope of a variable depends on
		where it is declared and is directly
		related to the organization defined
		by curly brackets. */
		//int i;
		for (int i = 0; i < 20; i++)
		{
			System.out.println("i is in scope: "+i);
		}
		System.out.println("i is NOT in scope: "+i);


		
		int i = 0;
		while (i < 20)
		{
			System.out.println("i is in scope: "+i);
			i++;
		}
		System.out.println("i is in scope: "+i);

	}
} // end class
