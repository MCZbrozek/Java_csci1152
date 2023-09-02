/* Computer programs need to be able to store
information for later use. This is where
variables come in. */
public class Part010Variables {
	public static void main(String[] args) {
		// A variable has a name, value, type,
		// and memory location
		int x = 365;
		// This variable is named x
		// its value is 0
		// its type is int (short for integer)
		// its memory location is managed by Java and difficult (and unnecessary) for
		// the programmer to get access to.

		System.out.println(x);

		// Variables can be DECLARED without being given a value.
		int sumOfTen; // declaration of an integer, a whole number (positive or negative)
		float ratio; // declaration of a "float", a decimal number (positive or negative)
		double position; // declaration of a "double", this is a float, but twice as precise, hence
							// double
		boolean isGreater; // declaration of a boolean, a true or false value

		// There are many, many more, some of which I will show here, but explain later:
		char letter;
		String word;
		Object anything;

		// Declaration means telling Java to reserve space in memory to store the
		// specified data type, AND to associate that memory location with the given
		// name.

		/*
		 * Variables can be given a value at
		 * the same time as they are declared.
		 * This is known as INITIALIZATION.
		 */
		double value = 3.1415;
		char c = 'f';
		int height = 53;
		int depth = -90;

		System.out.println(value);

		// Variables can be changed as much as you want
		// by assigning new values to them.
		value = 2.71828;
		value = 9.9999;
		value = 0;
		value = 1.42;

		System.out.println(value);

		// Setting a variable equal to a value is
		// known as ASSIGNMENT. Assigning a value
		// to a variable replaces the old value
		// in the variable's memory location.
		value = 4; // Replaces the 1.42 from earlier
		System.out.println(value);

		// TODO: Declare an integer variable named y and assign it the value 12.

		int y = 12;

		// TODO: Declare a double variable named bday and assign it the value
		// [month].[day].
		// For instance, if you were born on March 12th, the value would be 3.12.
		double bDay = 7.08;

		// TODO: Change the value of x to be 109. Do not declare x. Just assign it the
		// value.

		x = 109;

		// I will often use "declare", "create", and "make" interchangeably:
		// Declare a variable...
		// Create a variable...
		// Make a variable...

		// I will often use "assign", "set", "give", and "put" interchangeably:
		// assign a value of 4 to the variable...
		// set the variable equal to a value of 4...
		// give the variable a value of 4...
		// put 4 in the variable...

		// VARIABLE NAMING
		// variables can have letters and numbers and underscores in their names.
		// variables must start with a lowercase letter.
		// Variables should be written in "camel case" with later words in the name
		// capitalized, for instance, sumOfTen
		int productOfPrimes;
		int amount1;
		int amount2;
		int twiceAsLarge;

		/*
		 * TODO: Create an int variable that begins with a number, for instance 1base.
		 * Then recompile. You will get an error.
		 * Copy the text of the error here into this comment then comment out your
		 * variable so that the program compiles.
		 */

		// Never declare variables twice.

		/*
		 * TODO: Declare amount1 again.
		 * Then recompile. You will get an error.
		 * Copy the text of the error here into this comment then comment out your
		 * variable so that the program compiles.
		 */

	}

}
