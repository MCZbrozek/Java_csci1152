/* "Primitive" variables are passed to
methods by value. This means that a copy
of the information in the variable is
passed and the original variable is left
alone.

We discussed this in earlier examples when
talking about scope. */
public class Part395PassByValue
{
	public static void main(String[] args)
	{
		double var1 = 5.0;
		oneMethodToCall(var1);
		System.out.println("var1 = " +var1);

		int var2 = 7;
		twoMethodToCall(var2);
		System.out.println("var2 = " +var2);
	}

	public static void oneMethodToCall(double var1)
	{
		//This has no impact on the variable named
		//var1 in main.
		var1 = var1*5;
	}
	public static void twoMethodToCall(int var2)
	{
		//This has no impact on the variable named
		//var2 in main.
		var2 = var2*10;
	}
}