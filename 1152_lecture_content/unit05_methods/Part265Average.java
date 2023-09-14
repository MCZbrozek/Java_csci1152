/*
At the end of this unit you should be able to:
1. Create user-defined methods.
2. Identify all the parts of a method header.
3. Use return to send values back from a method and capture them in a variable.
4. Have a better understanding of the "static" keyword.
*/
public class Part265Average {
	public static void main(String[] args) {
		/*
		 * Methods are called or "invoked" by
		 * using the method's name followed by a
		 * pair of parentheses. The next line of
		 * code causes all the code contained
		 * between the curly brackets of
		 * calcSomething to execute.
		 */
		calcSomething();

		/*
		 * Methods typically take inputs,
		 * information put between their
		 * parentheses that is operated on by the
		 * code of the method.
		 */
		calcSomething2(-56, 45);

		/*
		 * It's very important that methods be
		 * able to return a calculated result, which
		 * can be "captured" in a variable.
		 */
		double average = calcAve(3, 4, 6);
		System.out.printf("ave = %f\n", average);

		/*
		 * TODO: Uncomment the following line
		 * of code, then scroll down to the other
		 * TODO and write the requested method
		 * declaration.
		 */
		// int product = multiplier(3,20);

	} // end of main

	// A method is like a stand-alone helper
	// program.
	public static void calcSomething() {
		System.out.println("something");
	}

	/*
	 * This method takes two doubles as inputs.
	 * The doubles x and y are variable declarations.
	 * The variables receive values when the method
	 * is called.
	 * modifiers return name parameters
	 */
	public static void calcSomething2(double x, double y) {
		if (x < 0)
			System.out.println("x is negative");

		if (0 < y)
			System.out.println("y is positive");
	}

	/*
	 * The following method returns a value of
	 * type double.
	 * output name inputs
	 */
	public static double calcAve(int var1, int var2, int var3) {
		double ave = (var1 + var2 + var3) / 3.0;
		return ave; // Return the value to the caller.
	}

	/*
	 * TODO: Write a public static method named
	 * multiplier. The method should return an int
	 * and take two ints as input. In the body of
	 * the method (meaning between the curly
	 * brackets) return the product of the two
	 * inputs.
	 */
	public static int multiplier(int a, int b) {
		return a * b;
	};

} // end class
