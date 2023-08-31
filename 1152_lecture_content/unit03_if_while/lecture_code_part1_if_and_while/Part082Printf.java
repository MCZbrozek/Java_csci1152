public class Part082Printf
{
	public static void main(String[] args)
	{		
		/* In terms of printing, so far you have seen
		  System.out.print
		and
		  System.out.println
		Allow me to introduce
		  System.out.printf
		for special formatting needs. */

		double bigNumber = 86.3927576202;
		System.out.print("How many decimal places do you want?\n");
		System.out.printf("How about 3? %.3f\n",bigNumber);
		System.out.printf("More %.6f looks like this.\n", bigNumber);
		System.out.printf("%.2f fewer like this.\n",bigNumber);
		
		//TODO: Write a line of code that prints 
		//bigNumber with only one decimal place.
	}
}
