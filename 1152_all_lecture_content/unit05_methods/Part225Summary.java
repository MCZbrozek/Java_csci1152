public class Part225Summary
{
	public static void main(String[] args)
	{
		int x = 7;
		int y = 8;
		
		boolean isReady = x > 10;
		
		System.out.println("isReady = " + isReady);
		
		isReady = x > 10 && y < 10;
		System.out.println("isReady = " + isReady);
		
		isReady = x < 10 && y < 10;
		
		System.out.println("isReady = " + isReady);
		
		x = 10;
		isReady = x >= 10 && y < 10;
		//prints true
		System.out.println("isReady = " + isReady);
		
		isReady = !isReady;
		System.out.println("isReady = " + isReady);
		
		isReady = !(x >= 10 && y < 10);
		System.out.println("isReady = " + isReady);
		
		isReady = x > 10 || y < 10;
		System.out.println("isReady = " + isReady);
		
		
		int age = 49;
		double multiplier = 0.0;
		if (age < 25) {
			multiplier = 2;
		}
		
		if (age > 24 && age < 35) {
			multiplier = 1;
		}
		
		if (age > 34) {
			multiplier = .5;
		}
		
		//if / else
		if (age < 25) {
			//executes if boolean expression is true
			multiplier = 2;
			System.out.println("m = "+multiplier);
		} else {
			//executes if boolean expression is false
			multiplier = .5;
			System.out.println("hello");
		}
		
		age = 20;
		//long nested if
		if (age < 25) {
			multiplier = 2;
		} else {
			if (age > 24 && age < 35) {
				multiplier = 1;
			} else {
				if (age > 34) {
					multiplier = .5;
				}
			}
		}
		
		if (age < 25) {
			multiplier = 2;
		} else if (age > 24 && age < 35) {
			multiplier = 1;
		} else if (age > 34) {
			multiplier = .5;
		}
		System.out.println(multiplier);
		
		
		System.out.println("\n=======================\n");
		
		/* All loops have the following features
			1. one or more control variables
			2. a condition
			3. modification of the control variable(s)
		TODO: Follow along as we identify the 3
		features in the following loops. */
		x = 7;
		int count = 1;
		while(x != 1)
		{
			//It is normal (and common) to have
			//if nested inside of loops.
			if(x%2==0)
			{
				x = x/2;
			}
			else
			{
				x = 3*x+1;
			}
			count++;
		}
		System.out.println("Sequence length: "+count+"\n");
		
		
		double[] values = {4.2, 73.2, 7.7, 1.8};
		for(int i=0; i<values.length; i++)
		{
			values[i] = values[i]*i;
		}
		System.out.println("Last value: "+
			values[values.length-1]);
		
	} // end main
} // end class
