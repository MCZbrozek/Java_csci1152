
public class Part205Scope
{
	public static void main(String[] args)
	{
		/* Variables are only accessible in
		certain contexts known as scope.
		The scope of a variable depends on
		where it is declared and is directly
		related to the organization defined
		by curly brackets. */
		
		exampleA();
		exampleB();
		exampleC();
		
		//System.out.println("x = "+ x); //BAD!
		//System.out.println("y = "+ y); //BAD!
		//System.out.println("z = "+ z); //BAD!
		//System.out.println("q = "+ q); //BAD!
	}
	
	public static void exampleA()
	{
		int x = 55;
		{
			x =9;
			System.out.println("x = "+ x);
		}
		System.out.println("x = "+ x);

	}

	public static void exampleB()
	{
		{
			int y = 7;
			System.out.println("y = "+ y);
		}
		System.out.println("y = "+ y); //BAD!
	}

	public static void exampleC()
	{
		int z = 0;
		while (z < 100)
		{
			int q = 5;
			z = z + 5*q;
			q++;
		}
		System.out.println("z = "+z);
		System.out.println("not valid var = " + q);
	}
	
} // end class
