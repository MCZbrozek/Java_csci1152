public class Part355Arrays
{
	public static void main(String[] args)
	{
		/* If you try to run the commented lines
		of code below there will be an error 
		because x has not been initialized. */
		//int x;
		//System.out.println(x);
		
		
		int[] c;
		//TODO: What error prints when you try to
		//run the following line of code?
		//System.out.println(c[0]);

		c = new int[3]; //initialize the array
		System.out.println(c); //hashcode of c
		System.out.println(c[0]); //first element
		
		c[0] = -45;
		c[1] = 6;
		
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		
		//We don't have to fill in all the values
		long[] m = new long[10000];
		m[100] = 56;
		m[9999] = 45;

	}
}
