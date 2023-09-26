// Name: Michael Zbrozek
// Class: 1152:101
// Assignment: Week4: ArraysLab
// Purpose: Loops exercises
// FileName: "ArraysLab.java"

/*
Be aware that arrays, loops, and the combination
are the most common things for students to
struggle with. And that's not just according to
your instructor:
https://levelup.gitconnected.com/5-things-that-are-hard-to-grasp-when-you-start-programming-1dc191c970c6

This may be helpful to read to get a different
perspective on arrays, though it does focus mostly
on indexing starting at zero:
https://medium.com/swlh/zero-indexed-arrays-f752a47abf65
*/
public class ArraysLab {
	public static void main(String[] args) {
		System.out.println("\n === PART 1 === \n");

		// create array with values 1, 7, 4, 6, 5, 5, 3
		int values[] = { 1, 7, 4, 6, 5, 5, 3 };
		// Use a for loop to print each value on new line
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

		System.out.println("\n === PART 2 === \n");
		// Display value at each index
		for (int i = 0; i < values.length; i++) {
			System.out.printf("The value at index %d is %d\n", i, values[i]);
		}

		System.out.println("\n === PART 3 === \n");
		// Value of each index counting from 1
		for (int i = 0; i < values.length; i++) {
			int index = i + 1;
			System.out.printf("The value at index %d is %d\n", index, values[i]);
		}
		System.out.println("\n === PART 4 === \n");
		// Use the correct index to print the value 6 from values array
		System.out.println(values[3]);

		System.out.println("\n === PART 5 === \n");
		/*
		 * Fill in the blanks to complete a program that
		 * counts up the values in the array that
		 * are greater than 4.
		 */

		int values2[] = { 5, 9, 3, 7, 2, 6 };
		int count = 0;
		for (int i = 0; i < values.length; i++) {
			if (values2[i] > 4) {
				count = i++;
			}
		}
		System.out.println(count + " values in the array are greater than 4");

		System.out.println("\n === PART 6 === \n");
		/*
		 * Fill in the blanks to complete a program that sums
		 * up the values in the array that are greater
		 * than the first value in the array.
		 */

		int numbers[] = { 6, 8, 1, 5, 9, 3, 7, 2, 6 };
		int total = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > numbers[0]) {
				total += numbers[i];
			}
		}
		System.out.println(total + " is the sum of values in the array greater than the first value");
		// The correct answer is 8+9+7=24

		System.out.println("\n === PART 7 === \n");
		/*
		 * Make a copy of the previous program,
		 * but modify it so that it sums up the
		 * indexes of the values that are greater
		 * than the first value. In other words,
		 * since 8 is at index 1, 9 is at index 4,
		 * and 7 is at index 6, the program should
		 * add up 1+4+6 = 11
		 */
		int numbers2[] = { 6, 8, 1, 5, 9, 3, 7, 2, 6 };
		int totalIndex = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers2[i] > numbers[0]) {
				totalIndex += i++;
			}
		}
		System.out.println(totalIndex + " is the sum of values in the array greater than the first value");

	}
}
