public class Marathon {
	public static void main(String[] arguments) {
		// Runner Names
		String[] names = {
				"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane",
				"Emily", "Daniel", "Neda", "Aaron", "Kate", "Jim"
		};
		// Runner Times
		int[] times = {
				341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265, 299
		};
		// --- Get pace in minutes/mile ---
		// Create an array of doubles from 'times' to calculate paces
		double[] timesDub = new double[times.length];
		for (int i = 0; i < times.length; i++) {
			timesDub[i] = times[i];
		}
		// Seperate Minutes and seconds for better printing
		// -- minutes
		double[] pacesMin = paceCalcsMin(timesDub);
		int[] pacesMinInt = paceMinInt(pacesMin);
		// -- seconds
		int[] pacesSecInt = paceCalcsSec(pacesMin);

		// --- Test print the PacesMinInt array to see the values
		// for (int pace : pacesMinInt) {
		// System.out.println("pacesMinInt Array ----" + pace);
		// }

		// --- Test print the pacesSecInt array to see the values
		// for (int pace : pacesSecInt) {
		// System.out.println("pacesSecInt Array ----" + pace);
		// }

		// index location of Fastest Runner
		int i1 = getFastestIndex(times);
		// index location of Second Fastest Runner
		int i2 = getSecondFastestIndex(times);

		// PRINT THE RESULTS
		System.out.printf(
				"%-30s %-7s Total Time: %2d, Pace per mile: %3d:%2d\n", "The fastest runner is:",
				names[i1],
				times[i1],
				pacesMinInt[i1],
				pacesSecInt[i1]);

		System.out.printf(
				"%-30s %-7s Total Time: %2d, Pace per mile: %3s:%2s\n",
				"The Second fastest runner is:",
				names[i2],
				times[i2],
				String.valueOf(pacesMinInt[i2]),
				String.valueOf(pacesSecInt[i2]));
	}

	// --- METHODS DEFINITIONS ----

	// getFastestIndex method
	/*
	 * A method that takes as input an array of integers and returns an
	 * integer. Pass the array of times to this method. The returned value is
	 * the index corresponding to the person with the lowest time.
	 */
	public static int getFastestIndex(int[] times) {
		int fastestTime = times[0];
		int fastestTimeIndex = 0;

		for (int i = 0; i < times.length; i++) {
			if (times[i] <= fastestTime) {
				fastestTime = times[i];
				fastestTimeIndex = i;
			}
		}
		return fastestTimeIndex;
	}

	// getSecondFastestIndex method
	/*
	 * A method to find the index of the second-fastest time. The
	 * second method uses the index determined in first method to find the best
	 * runner, and
	 * then loop through all values to find the second-best (second lowest) time.
	 */
	public static int getSecondFastestIndex(int[] times) {
		int secondFastestTime = times[0];
		int secondFastestTimeIndex = 0;
		int fastestIndex = getFastestIndex(times);

		for (int i = 0; i < times.length; i++) {
			if (times[i] <= secondFastestTime && times[i] > times[fastestIndex]) {
				secondFastestTime = times[i];
				secondFastestTimeIndex = i;
			}
		}
		return secondFastestTimeIndex;
	}

	// paceCalcsMin method
	/*
	 * The times array was converted to doubles above. This method divides time
	 * in minutes by 26.2 miles to determine the pace per pace.
	 * Result is double ex. 10.35262 minutes
	 */

	public static double[] paceCalcsMin(double[] timesDub) {
		double[] pacesMin = new double[timesDub.length];
		for (int i = 0; i < timesDub.length; i++) {
			pacesMin[i] = timesDub[i] / 26.2;
		}
		return (pacesMin);
	}

	// paceCalcsInt method
	/*
	 * This method converts array of doubles to Int and gives us just
	 * minutes per mile.
	 */

	public static int[] paceMinInt(double[] pacesMin) {
		int[] paceMinInt = new int[pacesMin.length];
		for (int i = 0; i < pacesMin.length; i++) {
			paceMinInt[i] = (int) Math.floor(pacesMin[i]);
		}
		return paceMinInt;
	}

	// paceCalcsSec method
	/*
	 * Subtracts Minutes to leave only the decimal in % minutes.
	 * Multiplied times 60 to give seconds.
	 * Result is typecast as int in an new array.
	 */

	public static int[] paceCalcsSec(double[] pacesMin) {
		int[] pacesSec = new int[pacesMin.length];
		for (int i = 0; i < pacesMin.length; i++) {
			double position = pacesMin[i];
			pacesSec[i] = (int) Math.floor((position - Math.floor(position)) * 60);
		}
		return pacesSec;
	}
}
