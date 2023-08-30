public class Part370Arrays
{
	public static void main(String[] args)
	{
		//Populating an array using a for loop.
		//Create array of values 100 through 150
		int[] x = new int[51];
		for(int i=100; i<=150; i++)
		{
			System.out.println("index "+(i-100)+" stores value "+i);
			x[i-100] = i;
		}
	}
}
