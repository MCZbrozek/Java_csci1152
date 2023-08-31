//Start with: RecursionStackFrames.docx
public class Part530Recursion
{

	public static void main(String[] args)
	{
		int input = 5;
		int x = factorial(input);
		System.out.println("The factorial of "+input+" is: "+x);
		
		System.out.println();

		x = power(2,3);
		System.out.println("The power is: "+x);

		System.out.println();

		int[] values = {0, 1, 2, 3};
		allCombinations(values, "");
	}
	
	public static int factorial(int n)
	{
		if(n==0 || n==1) //base case
			return 1;
		else //recursive case
			return n * factorial(n-1);
	}


	//Non recursive example
	public static int factorialIter(int n)
	{
		 int to_return = 1;
		 for(int i=n; i>1; i--)
			to_return = to_return * i;
		 return to_return;
	}


	public static int power(int base, int n)
	{
		if(n==0)
			return 1;
		else
			return base * power(base, n-1);
	}

	public static int[] remove(int[] values, int index)
	{
		int[] to_return = new int[values.length-1];
		for(int i=0; i<values.length; i++)
		{
			if(i<index)
				to_return[i] = values[i];
			else if(i==index)
				continue;
			else
				to_return[i-1] = values[i];
		}
		return to_return;
	}
	
	
	public static void allCombinations(int[] values, String prior)
	{
		if(values.length==1) //base case
		{
			System.out.printf(prior+"%d\n", values[0]);
			return;
		}

		//Recursive case
		String new_prior = "";
		for(int i=0; i<values.length; i++)
		{
			new_prior = prior+Integer.toString(values[i]);
			allCombinations( remove(values,i), new_prior);
		}
	}
}
