//Quick re-introduction to Exceptions
public class Part795Exceptions
{
	public static void main(String[] args)
	{
		int[] array = {1,2,3};
		
		//Try to execute some code, then respond
		//in a particular way if an exception
		//occurs.
		try {
			array[6] = 0;
		} catch (ArrayIndexOutOfBoundsException exc) {
			/* This block of code that executes
			if there is an exception.
			The Java Virtual Machine (JVM) creates
			an object out of the 
			ArrayIndexOutOfBoundsException class
			and assigns it to the variable exc. */
			System.out.println("Error Occurred. See message below:");
			System.out.println(exc.toString());
		}
	
	
		System.out.println("\n====================\n");
		
		
		int value = 56;
		//Imagine that this zero came from a file,
		//or from user input.
		int zero = 0;
		int calc = 0;
		try {
			calc = value/zero;
		} catch(ArithmeticException e) {
			System.out.println("calc = "+calc);
			System.out.println("divide by zero");
		}
		System.out.println("calc = "+calc);
	}
}
