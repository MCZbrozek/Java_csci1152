/* The ability to pass information in to a 
method and retrieve information from a method
is important for the generality and 
adaptability of our code. */
public class Part270Generality
{
	public static void main(String[] args)
	{
		int result;
		
		/* This method has no inputs or outputs.
		It's only good for one thing. */
		noInOrOutMethod();
		
		/* This method has an ouput, but without
		inputs (or randomness) the output is
		always the same. */
		result = outMethod();
		System.out.println("From out method: "+result);

		/* This method doesn't look like an
		improvement on the previous, but we're
		getting closer. */
		result = outMethodVariables();
		System.out.println("From out method variables: "+result);

		/* Finally a method with inputs. The 
		output of this method depends on the
		inputs. This method encapsulates any
		triple sum. */
		result = inAndOutMethod(6, 2, 8);
		System.out.println("From in and out method: "+result);

		/* This final example illustrates that 
		variables can also be used as inputs. */
		int d = 6;
		int e = 2;
		int f = 8;
		result = inAndOutMethod(d, e, f);
		System.out.println("From in and out method passed vars: "+result);
	}
	
	
	public static void noInOrOutMethod()
	{
		System.out.println(6*2+8);
	}

	public static int outMethod()
	{
		return 6*2+8;
	}

	public static int outMethodVariables()
	{
		int a = 6;
		int b = 2;
		int c = 8;
		return a*b+c;
	}

	public static int inAndOutMethod(int a, int b, int c)
	{
		return a*b+c;
	}
} // end class