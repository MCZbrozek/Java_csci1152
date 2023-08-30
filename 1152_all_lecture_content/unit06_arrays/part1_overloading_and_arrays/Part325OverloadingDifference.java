public class Part325OverloadingDifference
{
	public static void main(String[] args)
	{
		int x = difference(12, 7);
		System.out.println("diff between 12 and 7 is "+x);
		
		/* TODO: Uncomment the following 
		after you complete the TODO below. */
		//double y = difference(11.9, 7.2);
		//System.out.println("diff between 11.9 and 7.2 is "+y);

		double z = difference("11.9", "7.2");
		System.out.println("diff between 11.9 and 7.2 is "+z);
	}
	
	public static int difference(int a, int b)
	{
		return Math.abs(a - b);
	}
	
	/* TODO: Write a method to calculate
	and return the difference between two
	doubles. The return type should also
	be a double. */

	
	public static double difference(String a, String b)
	{
		double x = Double.parseDouble(a);
		double y = Double.parseDouble(b);
		return Math.abs(x - y);
	}
	
} // end class
