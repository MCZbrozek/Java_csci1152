public class Part315OverloadingSum
{
	public static void main(String[] args)
	{
		int result = sum(10);
		System.out.println(result);

		result = sum(6, 5);
		System.out.println(result);
		
		float result_f = sum(6.0f, 5.0f);
		System.out.println(result_f);

		double result_d = sum(6.0, 5.0);
		System.out.println(result_d);
	}


	public static int sum(int a)
	{
		System.out.println("Add 1");
		return a+1;
	}

	public static int sum(int a, int b)
	{
		System.out.println("Sum integers");
		return a+b;
	}

	public static float sum(float a, float b)
	{
		System.out.println("Sum floats");
		return a+b;
	}

	public static double sum(double a, double b)
	{
		System.out.println("Sum doubles");
		return a+b;
	}
	
} // end class
