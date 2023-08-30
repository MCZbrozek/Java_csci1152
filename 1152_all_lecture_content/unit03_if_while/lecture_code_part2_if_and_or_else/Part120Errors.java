import java.util.Scanner;

public class Part120Errors
{
	public static void main(String[] args)
	{
		int x = 5;
		/* In math class it's perfectly reasonable
		to write  1 <= x <= 10
		but that's a no-no in Java.
		TODO: What error do you get when you 
		uncomment the following? Answer in a comment. */
		//if(1 <= x <= 10)
		{
			System.out.println("This is x: "+x);
			x = 8*x - 12;
		}
		
		
		System.exit(1); //Prevent going onward
		
		
		/* To avoid mistakes when looping, use 
		less than < or greater than > whenever 
		possible. For instance, if you want to 
		"stop looping when x reaches zero" do not 
		do the following: */
		System.out.println("\nBegin countdown");
		while(x != 0)
		{
			System.out.println(x);
			x = x-3;
		}
		/* TODO:
		A: What went wrong in the previous loop?
		B: How do you stop an infinite loop?
		C: Fix the code so the loop ends. */
		

		System.exit(1); //Prevent going onward
		

		/* The previous problem is particularly
		common with doubles. The following code
		looks okay, but isn't.
		Source: 		www.java67.com/2015/09/float-and-double-value-comparison-in-java-use-relational.html */
		System.out.println("\nPrint out balance.");
		double balance = 10;
		while( balance!=0 )
		{
			System.out.println(balance);
			balance = balance - 0.1;
		}

	}
}