/* The following code comes from the book
Fig. 6.6: RandomIntegers.java
potentially with modifications. */
import java.security.SecureRandom;

public class Part435RandomRanges
{
	public static void main(String[] args)
	{
		// randomNumbers object will produce
		// secure random numbers
		SecureRandom randomNumbers = new SecureRandom(); 
		
		// loop 20 times
		for (int counter=1; counter<=20; counter++)
		{
			// pick random integers from 10 to 20
			// inclusive
			int upper_limit = 20;
			int lower_limit = 10;
			int face = lower_limit + randomNumbers.nextInt(upper_limit - lower_limit + 1);
			
			// display generated value
			System.out.printf("%5d", face);
			
			// if counter is divisible by 5, start a new line of output
			if (counter % 5 == 0)
				System.out.println();
		}
		
		System.out.println("\nNext up are random doubles:");
		
		// loop 20 times
		for (int counter=1; counter<=20; counter++)
		{
			// pick random doubles from -5 to 5
			// inclusive
			double upper_limit = 5;
			double lower_limit = -5;
			double face = lower_limit + randomNumbers.nextDouble() * (upper_limit - lower_limit);
			
			// display generated value
			System.out.printf("%7.2f", face);
			
			// if counter is divisible by 5,
			// start a new line of output
			if (counter % 5 == 0)
				System.out.println();
		}
	}
} // end class

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and			*
 * Pearson Education, Inc. All Rights Reserved.		*
 *				*
 * DISCLAIMER: The authors and publisher of this book have used their	*
 * best efforts in preparing the book. These efforts include the *
 * development, research, and testing of the theories and programs		*
 * to determine their effectiveness. The authors and publisher make	*
 * no warranty of any kind, expressed or implied, with regard to these	*
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or	*
 * consequential damages in connection with, or arising out of, the	*
 * furnishing, performance, or use of these programs.* *************************************************************************/
