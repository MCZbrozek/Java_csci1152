// Name: Michael Zbrozek
// Class: 1152:101
// Assignment: Week3: Method Assignment
// Purpose: Learn Java Methods
// FileName: "MethodAssignment.java"

// Import Scanner Class 
import java.util.Scanner;

public class MethodAssignment {
	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);

		/* PART 1: CALLING A METHOD */
		System.out.println("*-*- Part 1 -*-*");

		// A joke to warm up the audience -
		System.out.println(
				"Pirate Converter - What are letters of the Pirate Alphabet?\n -- Eh, Arrg, and the seven Seas");
		// User input to convert to piratese -
		System.out.println("\nEnter a sentence to convert to Piratese: ");
		String normalSentance = input.nextLine();
		// capture the returned String from convertToPiratese in a new variable and
		// print it out.
		String pirateSentence = convertToPiratese(normalSentance);
		System.out.println(pirateSentence);

		/* PART 2: FOR LOOP IN A METHOD */
		System.out.println("\n*-*- Part 2 -*-*");

		// A joke to warm up the audience -
		System.out.println(
				"What do prime numbers and stoners have in common?\n -- The higher they are the more spaced out they get! \n");
		// Get a number from the user
		System.out.println("Want to find out if a number is prime? Enter a number here: ");
		// assign user input to a variable
		int userNum = input.nextInt();
		// run the isPrime method (print statement in method)
		isPrime(userNum);

		/* PART 3: WRITE A METHOD */
		System.out.println("\n*-*- Part 3 -*-*");

		// Get input sideCount from the user and save to variable
		System.out.print("Welcome to the Polygon Area calculator - \n");
		System.out.println("How many sides does your polygon have: ");
		int sideCount = input.nextInt();
		// Get input sideLength from the user and save to variable
		System.out.println("How long are the sides of your polygon in units: ");
		double sideLength = input.nextDouble();
		// save the result of calcPolygonArea method in a variable
		double area = calcPolygonArea(sideCount, sideLength);
		// print result for user
		System.out.printf("The area of your polygon with %d sides and length of %,.4f units is: %,.3f units squared",
				sideCount, sideLength, area);
		input.close(); // Close the scanner

		/* PART 4: NESTED CONTROL FLOW */
		System.out.println("\n\n*-*- Part 4 -*-*");

		int secretNumber = randomNumber();
		System.out.println(secretNumber);
		playIsHighOrLow(secretNumber);

	}

	// **** Part 1 ****
	// Pirate Conversion Method
	public static String convertToPiratese(String normalSentence) {
		normalSentence = normalSentence.toLowerCase();
		String pirateSentence = normalSentence.replace("hello", "");
		pirateSentence = "Ahoy, matey! " + pirateSentence + " Where's the rum?";
		pirateSentence = pirateSentence.replace("ar", "Aarrr!");
		return pirateSentence;
	}

	// **** Part 2 ****
	// The following method takes an integer as input and returns true or false.
	public static void isPrime(int userNum) {
		boolean flag = false; // From - https://www.programiz.com/java-programming/examples/prime-number
		if (userNum < 2) {
			flag = false;
		}
		for (int counter = 2; counter < (userNum / 2); counter++) {
			if (userNum % counter == 0) {
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println(userNum + " is a prime number.");
		else
			System.out.println(userNum + " is NOT a prime number");
	}

	// **** Part 3 ****
	// The following method calculates the area of a user defined polygon
	public static double calcPolygonArea(int sideCount, double sideLength) {
		double numerator = sideCount * (Math.pow(sideLength, 2));
		double denominator = 4 * Math.tan((Math.PI) / (sideCount));
		return numerator / denominator;
	}

	// **** Part 4 ****
	// The following method takes a guess from the user and matches it to a secret
	// number
	public static int randomNumber() {
		// Declare a min and max
		// https://www.geeksforgeeks.org/java-math-random-method-examples/
		int min = 0;
		int max = 100;
		// generate secret number(rand decimal * 100, rounded down with .floor)
		int secretNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
		return secretNumber;
	}

	public static void playIsHighOrLow(int secretNumber) {
		// initialize a new scanner variable for the game
		Scanner guessInput = new Scanner(System.in);
		// The rules of the game
		System.out.println("Try to guess the number from 1 to 100, enter your guess: ");
		// recieve a guess from the user
		int userGuess = guessInput.nextInt();

		while (userGuess != secretNumber) {
			evaluateHighLow(secretNumber, userGuess);
			userGuess = guessInput.nextInt();
		}
		System.out.println("How wonderful!! \n Your guess of " + userGuess + " was correct!!!");
		guessInput.close();
	}

	public static void evaluateHighLow(int secretNumber, int userGuess) {
		if (userGuess > secretNumber) {
			if (userGuess < (secretNumber + 10)) {
				System.out.println("Your guess is too high, but within 10! Guess again: ");
			} else {
				System.out.println("Your guess is too high, guess again: ");
			}
		} else if (userGuess < secretNumber) {
			if (userGuess > (secretNumber - 10)) {
				System.out.println("Your guess is too low, but within 10! Guess again: ");
			} else {
				System.out.println("Your guess is too low, guess again: ");
			}
		} else {
			userGuess = secretNumber;
		}
	}
}
