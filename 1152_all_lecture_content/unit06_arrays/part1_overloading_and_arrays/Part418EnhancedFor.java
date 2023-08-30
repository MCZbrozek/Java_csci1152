/* This is another book example:
Fig. 6.9: EnhancedForTest.java
Using enhanced for statement to total
integers in an array.

I will never be testing you on the use of
this technique, though it can be handy. */
public class Part418EnhancedFor
{
	public static void main(String[] args)
	{
		int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		int total = 0;

		// add each element's value to total
		for (int number : array){ //for-each loop
			total += number;
		}
		System.out.printf("Total of array elements: %d%n", total);

		total = 0; //reset
		for(int i=0; i<array.length; i++){
			total += array[i];
		}
		System.out.printf("Total of array elements: %d%n", total);
	}
} // end class EnhancedForTest

/*********************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and *
 * Pearson Education, Inc. All Rights Reserved. * * *
 * DISCLAIMER: The authors and publisher of this book have used their *
 * best efforts in preparing the book. These efforts include the *
 * development, research, and testing of the theories and programs *
 * to determine their effectiveness. The authors and publisher make *
 * no warranty of any kind, expressed or implied, with regard to these *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or *
 * consequential damages in connection with, or arising out of, the *
 * furnishing, performance, or use of these programs. *
 ********************************************************/
