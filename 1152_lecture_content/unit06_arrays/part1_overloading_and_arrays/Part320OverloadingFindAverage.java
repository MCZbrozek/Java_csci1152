public class Part320OverloadingFindAverage
{
	public static void main(String[] args)
	{
		findAverage(); //call or invoke
		
		//overloading
		findAverage(10, 20, 30);
		
		float average = findAverage(100f,0);
		System.out.println("average = "+average);		
		
		int x = findMin(99, 26, 4);
		System.out.println("minimum = "+x);
	}


	//modifiers  return   name        parameters
	//            type
	public static void   findAverage(          )
	{
		int number1 = 10;
		int number2 = 20;
		
		float average = (number1 + number2)/2;
		
		System.out.println("average = "+average);
	}

	
	public static void findAverage(int number1, int number2, int number3)
	{
		float average = (number1 + number2 + number3)/3;
		
		System.out.println("average = "+average);
	}
	
	
	public static float findAverage(float number1, float number2)
	{
		float average = (number1 + number2)/2;
		
		return average;
	}
	
	
	public static float findAverage(float number1, int number2)
	{
		float average = (number1 + number2)/2;
		System.out.println("We ran this code");
		return average;
	}
	
	
	public static float findAverage(int number1, int number2)
	{
		float average = (number1 + number2)/2;
		System.out.println("We ran this instead of the two floats method.");
		return average;
	}
	
	
	public static int findMin(int number1, int number2, int number3)
	{
		return Math.min(number3, Math.min(number1, number2));
	}
	
} // end class
