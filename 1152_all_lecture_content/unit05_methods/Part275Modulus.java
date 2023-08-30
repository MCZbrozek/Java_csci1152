/* Modulus is a useful operator that calculates
the remainder after division. It is useful for
determining if a number is divisible by another
number. It is also useful for repeating a
sequence of values such as the time of a clock.
*/
public class Part275Modulus
{
	public static void main(String[] args)
	{
		System.out.println();
		
		int my_number = 12;
		boolean result = isEven(my_number);
		System.out.println(result);
		
		
		System.out.println();
		
		
		//Print out the numbers 1 through 12
		//repeatedly in order.
		for(int i=0; i<50; i++)
		{
			System.out.printf("%5d", (i%12)+1 );
		}
		
		
		System.out.println();
		
		
		/* We can call methods defined in other
		classes, but we have to tell Java where
		the method is located using a dot. */
		double x = Part280Sphere.sphereVolume(my_number);
		System.out.println( x );
		System.out.println();
		
		/* TODO: Follow along as we write a
		method, isOdd, that returns true if
		its input is odd, and returns false
		otherwise.
		Note that methods can call other
		methods. */
		//System.out.println( isOdd(my_number) );
		
		System.out.println();
		
	} // end main
	


	public static boolean isEven(int x)
	{
		return x%2==0;
	}

} // end class
