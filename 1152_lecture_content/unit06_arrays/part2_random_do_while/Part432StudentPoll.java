/* The following example is from the book
Fig. 6.8: StudentPoll.java
Poll analysis program. */
public class Part432StudentPoll
{
	public static void main(String[] args)
	{
		// student response array (This is more
		// typically, input at run time)
		int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
		// array of frequency counters
		int[] frequency = new int[6];

		// Use each response as an index into
		// the frequency array to determine the
		// element to increment
		for (int i=0; i<responses.length; i++)
		{
			try
			{
				//Book version:
				//++frequency[responses[i]];
				
				//My way
				int j = responses[i];
				frequency[j] = frequency[j]+1;
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
				System.out.printf("	responses[%d] = %d%n%n", i, responses[i]);
			}
		}

		System.out.printf("%s%10s%n", "Rating", "Frequency");
			
		// output each array element's value
		for(int rating=1; rating<frequency.length; rating++)
		{
			System.out.printf("%6d%10d%n", rating, frequency[rating]);
		}
	}
} // end class

/**********************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and*
 * Pearson Education, Inc. All Rights Reserved.***
 * DISCLAIMER: The authors and publisher of this book have used their	  *
 * best efforts in preparing the book. These efforts include the *
 * development, research, and testing of the theories and programs *
 * to determine their effectiveness. The authors and publisher make *
 * no warranty of any kind, expressed or implied, with regard to these *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or *
 * consequential damages in connection with, or arising out of, the *
 * furnishing, performance, or use of these programs. *
 ********************************************************/
