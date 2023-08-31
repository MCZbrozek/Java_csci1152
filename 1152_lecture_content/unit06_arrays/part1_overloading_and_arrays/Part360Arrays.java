public class Part360Arrays
{
	public static void main(String[] args)
	{
		//Average of three integers
		int grade1 = 75;
		int grade2 = 56;
		int grade3 = 68;
		double average = (grade1+grade2+grade3)/3.0;
		System.out.printf("The average is %.2f\n",average);


		//How to calculate the average of an array?
		int[] grades = {grade1, grade2, grade3, 45, 67, 89, 78, 67};
		int sum = 0;
		for (int i = 0; i < grades.length; i++)
		{
			sum = sum + grades[i];
		}
		average = (double)sum/grades.length;
		System.out.printf("The average is %.2f\n",average);
		
		
		/* Counting down instead of counting up
		is not useful for averages, but is useful
		for finding the last occurrence of a
		value in an array. */
		sum = 0;
		for (int i=grades.length-1; i>=0; i--)
		{
			sum = sum + grades[i];
		}
		average = (double)sum/grades.length;
		System.out.printf("The average is %.2f\n",average);
		
		
		//Here's how to find the average with methods
		average = findAverage(grades);
		System.out.printf("The average is %.2f\n",average);
	}
	
	public static double findAverage(int[] intArray)
	{
		int sum = 0;
		for(int i = 0; i < intArray.length; i++)
		{
			sum = sum + intArray[i];
		}
		return (double)sum/intArray.length;
	}

}
