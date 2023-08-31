/*
Practice and review content so far:
	print
	variables
	inputs
	if
	while

Preview of content to come:
	Math library: exponents, roots, absolute value
	type casting with numeric types
	for loops
	methods
*/
import java.util.Scanner;
import java.lang.Math;

public class Part090ReviewAndPreview
{
	/* The following code demonstrates how to
	a calculator might calculate the cosine
	of a number. */
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("\nGive me a number: ");
		double x = input.nextDouble(); //Trying to find cosine of this number
		
		//A correct answer for comparison.
		//Note the use of the Math library's
		//cos method.
		double correct_cos = Math.cos(x);
		
		//Source for the following:
		//https://austinhenley.com/blog/cosine.html
		double num_terms = 10;
		int div = (int)(x / Math.PI);
		x = x - (div * Math.PI);
		int sign = -1;
		double estimate = 1.0;
		double inter = 1.0;
		double num = x * x;
		for (int i = 1; i <= num_terms; i++)
		{
			double comp = 2.0 * i;
			double den = comp * (comp - 1.0);
			inter *= num / den;
			estimate += inter*sign;
			sign *= -1; //flip the sign
		}
		//If div is odd, flip the estimate
		if (div % 2 != 0) {
			estimate = estimate*-1;
		}
		
		System.out.printf("%-22s %f\n","The correct cosine is:", correct_cos);
		System.out.printf("%-22s %f\n", "Our estimate is:", estimate);
		input.close();
	}

}
