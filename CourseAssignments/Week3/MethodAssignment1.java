
/* An example of one particular 
interaction with a correct and working
version of this assignment follows:

BEFORE: Hello, how are you?
AFTER: Ahoy, matey! , how Aarrr!e you? Where's the rum?

6 is prime is false
7 is prime is true

Regular polygon with 5 sides and side length 34.0 has this area:
area = 1988.8718750808457

Guess the secret integer: 50
Your guess is too low.
Wrong! Try again: 75
Your guess is too low.
Wrong! Try again: 82
Your guess is too high.
Wrong! Try again: 78
Your guess is too high.
Wrong! Try again: 76
Correct!
*/
public class MethodAssignment1 {
	public static void main(String[] args) {
		/* PART 1: CALLING A METHOD */
		/*
		 * Create a String variable and
		 * set its value to be a common
		 * English sentence of your choice.
		 * Then call the convertToPiratese
		 * method and pass your String to
		 * it. Also capture the returned
		 * String from convertToPiratese
		 * in a new variable and print it
		 * out.
		 * HINT: Use control-f to search for
		 * the convertToPiratese lower down
		 * in this file and see how it works.
		 * Consider crafting a sentence to
		 * fit the method.
		 */
		// YOUR CODE GOES HERE
		String normalSentance = "This is a normal sentence";
		System.out.println(convertToPiratese(normalSentance));

		/* PART 2: FOR LOOP IN A METHOD */
		/*
		 * Search for the isPrime method
		 * in this file and then fix the
		 * code within isPrime. Test your
		 * fix by calling the method from
		 * main with a prime number and a
		 * non-prime number and printing
		 * the results.
		 */
		// YOUR CODE GOES HERE

		/* PART 3: WRITE A METHOD */
		/*
		 * Write a method named
		 * calcPolygonArea. The method will
		 * have two inputs, an integer named
		 * sideCount and a double named
		 * sideLength. The method will return
		 * a double, which is the area of
		 * the polygon defined by these
		 * measurements. See the associated
		 * image for details of the
		 * calculation.
		 * Tset out your code by calling the
		 * methof with a sideCount of 5 and a
		 * sideLength of 34. Print the
		 * resulting area. It should be
		 * 1988.8718750808457
		 * HINT: Inside the method, organize
		 * the calculation into separate
		 * variables named numerator and
		 * denominator, then divide them.
		 * This will simplify and organize
		 * your code.
		 */

		/* PART 4: NESTED CONTROL FLOW */
		/*
		 * Import the Scanner at the start
		 * of this file, then instantiate a
		 * new Scanner variable here in main.
		 * Fill in the code below, including
		 * a new method, to implement a
		 * higher-lower guessing game.
		 */
		int userGuess = 0;
		/*
		 * TODO: Use a print statement
		 * and the Scanner's nextInt to ask
		 * the user for a guess.
		 */

		int secretNumber = 76;
		// while (userGuess != secretNumber) {
		/*
		 * TODO: Write a new method
		 * named isHighOrLow and pass both
		 * userGuess and secretNumber to
		 * it. isHighOrLow should take two
		 * ints as input and return nothing,
		 * void. The method should print out
		 * if the guess is too high or too
		 * low or correct using an if,
		 * else if, and an else statement.
		 * After the method is called,
		 * prompt the user for another
		 * guess and use the Scanner to
		 * read it in to the userGuess
		 * variable.
		 */
		System.out.println(
				"You will eventually fix this, but in the meantime \"Control-C\" can be used to quit this program because it is hanging.");
		// }
		// TODO Print out that the user
		// guessed correctly.

		/*
		 * TODO: Uncomment this line once
		 * the Scanner has been created,
		 * assuming your Scanner is named
		 * "input"
		 */
		// input.close(); //Close the Scanner
	}

	/*
	 * The following method takes an integer as input and returns true or false.
	 * true is returned if the integer is prime. false is returned otherwise.
	 */
	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		/*
		 * OH NO! The for loop is missing!
		 * Write a for loop that initializes
		 * a variable named i starting at 2
		 * and loops as long as i is less
		 * than n/2, increasing i by 1
		 * each time the loop repeats.
		 * The curly brackets of the loop
		 * are already provided for you.
		 * NOTE: There are more efficient
		 * ways of determining if a number
		 * is prime. If you're feeling fancy
		 * you can write the code more
		 * efficiently.
		 */
		// YOUR CODE GOES HERE
		int i = 0;// Delete this line and replace it with a for loop.
		{
			// if n is divisible by i...
			if (n % i == 0) { // ...then n is not prime.
				return false;
			}
		}
		return true;
	}

	/*
	 * The following method takes a String of English text as input and returns a
	 * new String that is a conversion of the text to pirate lingo.
	 */
	public static String convertToPiratese(String normalSentence) {
		normalSentence = normalSentence.toLowerCase();
		String pirateSentence = normalSentence.replace("hello", "");
		pirateSentence = "Ahoy, matey! " + pirateSentence + " Where's the rum?";
		pirateSentence = pirateSentence.replace("ar", "Aarrr!");
		return pirateSentence;
	}

}
