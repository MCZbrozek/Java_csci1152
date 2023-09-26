// Name: Michael Zbrozek
// Class: 1152:101
// Assignment: Week4: RollDie
// Purpose: Roll a six-sided die a bunch of times.
// FileName: "Part178Random.java"

// Fig. 6.7: RollDie.java
// Roll a six-sided die a bunch of times.

import java.security.SecureRandom;

public class Part178Random {
	public static void main(String[] args) {
		// randomNumbers object will produce secure random numbers
		SecureRandom randomNumbers = new SecureRandom();

		// Create an array for the die faces
		int frequencies[] = new int[6];

		// tally counts for 6,000,000 rolls of a die
		for (int roll = 1; roll <= 6000000; roll++) {
			int face = 1 + randomNumbers.nextInt(6); // number from 1 to 6
			frequencies[face - 1]++;
		}

		System.out.println("Face\tFrequency"); // output headers
		for (int i = 0; i < frequencies.length; i++) {
			System.out.printf("%d\t%d\n", i + 1, frequencies[i]);
		}
	}
} // end class RollDie

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and *
 * Pearson Education, Inc. All Rights Reserved. *
 * *
 * DISCLAIMER: The authors and publisher of this book have used their *
 * best efforts in preparing the book. These efforts include the *
 * development, research, and testing of the theories and programs *
 * to determine their effectiveness. The authors and publisher make *
 * no warranty of any kind, expressed or implied, with regard to these *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or *
 * consequential damages in connection with, or arising out of, the *
 * furnishing, performance, or use of these programs. *
 *************************************************************************/
