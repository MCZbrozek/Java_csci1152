/* The following program will not compile.
This is a brief review and recap of
concepts. */
public class Part420Review
{
	// "foo" is often used by programmers as a
	// nonsense function name in examples.
	public static void foo(int a)
	{
		a = a*7-60;
		if(a==10)
		{
			System.out.println("You got it.");
		}
	}

	public static int foo2(int x)
	{
		int z = x*x-x;
		return z;
	}

	public static void main(String[] args)
	{
		//TODO: Fix the bugs in this code:
		//There are three.
		while(day < 4
			System.out.println(day)



		//What does the following code print?
		//Try to figure it out without running it.
		int z = 5;
		z = foo2(z);
		System.out.println("Output 1: "+z);

		//What does the following code print?
		//Try to figure it out without running it.
		z = 5;
		foo2(z);
		System.out.println("Output 2: "+z);
		
		//What does the following code print?
		//Try to figure it out without running it.
		//There is no mistake here. I triple
		//checked.
		int x = 9;
		System.out.println("Output 3: ");
		foo(x);
		
		//What does the following code print?
		//Try to figure it out without running it.
		int x = 10;
		System.out.println("Output 4: ");
		foo(x);
		
		//What does the following code print?
		//Try to figure it out without running it.
		System.out.println("Output 5: ");
		for(int i=-2; i<3; i++) //-2, -1, 0, 1, 2, 3
		{
			if(i > 0)
				System.out.printf("%d,",i); //4th, 5th
			else
				System.out.printf("-"); //1st, 2nd, 3rd
		}
	}
}
