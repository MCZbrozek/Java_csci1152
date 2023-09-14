
//Other Scanner methods.
import java.util.Scanner;

public class Part040Input {
	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);

		/*
		 * nextInt is only one Scanner method.
		 * There are many more you can read about here:
		 * https://www.w3schools.com/java/java_user_input.asp
		 * such as:
		 * nextDouble - for reading in values with decimal places
		 * next - for reading in a single "word"
		 * nextLine - for reading in an entire line
		 */
		System.out.print("Enter a number with values after the decimal, such as 3.14: ");
		//
		double value = input.nextDouble();
		System.out.printf("Displayed with 8 total width and two decimal places: '%8.2f'\n", value);

		input.nextLine(); // Flushes the buffer, so that we can write our phrase below

		System.out.print("Enter a sentence or any phrase with spaces: ");
		String sentence = input.nextLine();
		System.out.println("Echo: \n" + sentence);

		/*
		 * TODO: Something goes wrong when this
		 * code is run. Follow along and include the
		 * fix described in class.
		 */

		input.close(); // Close your Scanner!
		// Some versions of Java complain if you don't.
	}
}
