// Name: Michael Zbrozek
// Class: 1152:101
// Assignment: Week3: Loop Assignment
// Purpose: Practice with loops
// FileName: "LoopAssignment.java"

import java.util.Scanner;
import java.lang.Math;

public class LoopAssignment {
	public static void main(String[] args) {
		/* PART 1: LOOP CONTROL VARIABLE */
		/*
		 * The following code calculates
		 * the square root of the user input.
		 * What is the loop control variable?
		 * Answer in a comment right here:
		 */
		// Loop control variable: __difference_______
		/*
		 * HINT: The loop control variable
		 * is the variable that is BOTH used
		 * in the condition of the loop AND
		 * has its value changed inside the
		 * body of the loop.
		 * An explanation of this code is
		 * provided at the bottom of this
		 * document.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("----- PART 1 -----");
		System.out.print("Give me a positive number and I will find its square root: ");
		double x = input.nextDouble();
		double guess = 2;
		double error = 0.0001;
		double difference = Math.abs(guess * guess - x);
		while (difference > error) {
			guess = (guess + x / guess) / 2.0;
			difference = Math.abs(guess * guess - x);
		}
		System.out.printf("%-22s %f\n", "The estimated square root is:", guess);
		System.out.printf("%-22s %f\n", "Compared to the actual:", Math.sqrt(x));

		/* PART 2: BAD INPUT */
		System.out.println("\n----- PART 2 -----");
		System.out.println(
				"A logarithm (or log) is the mathematical expression used to answer the question:\nHow many times must one 'base' number be multiplied by itself to get some other particular number?\nLet's take the log of a number");
		System.out.print("\nGive me a POSITIVE number: ");
		x = input.nextDouble();
		while (x <= 0) {
			System.out.print("The log of 0 or negative numbers is undefined, please enter a POSITIVE number: ");
			x = input.nextDouble();
		}
		double logBase10 = Math.log10(x);
		System.out.print("\nThe log base 10 of " + x + " is " + logBase10);

		/* PART 3: UNTIL */
		System.out.println("\n\n----- PART 3 -----");

		int millionOrBust = 2;

		while (millionOrBust <= 1000000) {
			millionOrBust = millionOrBust * 2;
			// System.out.println(millionOrBust);
		}

		System.out.println("The smallest power of two less than one million is: " + millionOrBust);
		/*
		 * An example interaction with a correct version of this assignment follows:
		 * 
		 * Give me a positive number and I will find its square root: 144
		 * The estimated square root is: 12.000000
		 * Compared to the actual: 12.000000
		 * 
		 * Give me a POSITIVE number: -3
		 * 
		 * The number must be greater than zero. Try again: -6
		 * 
		 * The number must be greater than zero. Try again: 1000
		 * 
		 * The log base 10 of 1000.0 is 3.0
		 * 
		 * The smallest power of two less than one million is 1048576
		 */

		input.close(); // Close the Scanner
	}
}

/*
 * HOW DOES THE SQUARE ROOT ALGORITHM WORK?
 * 
 * The key to calculating the square root is repeated application of this step:
 * 
 * estimate = (estimate + x/estimate) / 2.0;
 * 
 * Consider 100. If we estimate that the square root is 5, then x/estimate is
 * 100/5 = 20 which is too high. But then we average together our current
 * estimate with 20 in the line of code above and our new estimate will be
 * larger (and therefore closer to correct).
 * 
 * If instead we estimate too high that the square root is 12, then x/estimate
 * is 100/12 = 8.333 which is too low. But then we average together our current
 * estimate with 8.333 and our estimate comes down, closer to correct.
 * 
 * The process is repeated until the desired accuracy is achieved.
 * 
 */
