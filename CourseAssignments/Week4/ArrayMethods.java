
public class ArrayMethods {
	// 1.
	public static void printArray(char[] charArray) {
		// implement algorithm here. for-loop to print array
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
	}

	// 2.
	public static void printArray(int[] intArray) {
		// implement algorithm here. for-loop to print array
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

	// 3.
	public static void shiftDown(char[] charArray, int index) {
		// implement algorithm here. for loop to shift down values
		for (int i = charArray.length - 1; i > index; i--) {
			int loc = i - 1;
			charArray[i] = charArray[loc];
		}
		System.out.println(charArray);
	}

	// 4.
	public static int findMinValue(int[] intArray) {
		// implement algorithm here. for loop to find min value
		int minValue = intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] < minValue) {
				minValue = intArray[i];
			}
		}
		return minValue;
	}

	// 5.
	public static int findMinIndex(int[] intArray, int minValue) {
		// implement algorithm here. for loop to find min index
		int minIndex = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == minValue) {
				minIndex = i;
			}
		}
		return minIndex;
	}

	// 6.
	public static char[] copy(char[] fromArray) {
		// make to array same length as from array
		char[] toArray = new char[fromArray.length];

		// implement for-loop to copy values from fromArray to toArray
		for (int i = 0; i < fromArray.length; i++) {
			toArray[i] = fromArray[i];
		}

		return toArray;

	}

	public static void main(String[] args) {
		char[] charArray = { 'H', 'O', 'W', 'D', 'Y' };

		int[] intArray = { 99, 100, 85, 101, 93 };

		System.out.println("\nCorrect output is HOWDY. Your program may print it vertically:");
		printArray(charArray);

		System.out.println("\nCorrect output is 99 100 85 101 93. Your program may print it vertically:");
		printArray(intArray);

		System.out.println("\nCorrect output after the shiftDown is HOOWD. Your program may print it vertically:");
		shiftDown(charArray, 1);
		printArray(charArray); // Should print HOOWD

		System.out.println("\nCorrect output is minValue = 85 minIndex = 2:");
		int minValue = findMinValue(intArray);
		int minIndex = findMinIndex(intArray, minValue);
		System.out.println("minValue = " + minValue + " minIndex = " + minIndex);

		System.out.println("\nCorrect output is HOOWD. Your program may print it vertically:");
		char[] toArray = copy(charArray);
		printArray(toArray);
	}
}
