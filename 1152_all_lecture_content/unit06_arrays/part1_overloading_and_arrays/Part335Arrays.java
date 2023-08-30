/*
Arrays
- allow us to store multiple values and 
  associate them with one variable.
- each value in an array has to have the
  same data type. ie int, double, float etc...
- You have to give a size with an array. Tell
  java how many values/elements you want to
  store.
*/

public class Part335Arrays
{
	public static void main(String[] args)
	{
		// If you find yourself numbering
		// variables...
		double x1 = 63.23;
		double x2 = 3452.23;
		double x3 = 12.873;
		
		// ...you should be doing this
		// instead:
		double xs[] = new double[3];
		xs[0] = 63.23;
		xs[1] = 3452.23;
		xs[2] = 12.873;
		
		// Or even this:
		double ys[] = {63.23, 3452.23, 12.873};
		
		// Elements of an array must be printed
		// using indexing:
		int index = 1;
		System.out.println(xs[index]);
		
		// You cannot print all the values by
		// printing the variable name. We will
		// see how to print an array in the
		// next part.
		System.out.println(xs);
		
	}
}
