
public class Part780TwoDArrayLoops
{
	public static void main(String[] args)
	{
		//Create a 3x4 array of doubles
		double[][] a = new double[3][4];
		
		//Populate the array
		for(int row=0; row < a.length; row++)
		{
			for(int col = 0; col < a[row].length; col++)
			{
				//Just an example calculation that
				//has no particular meaning.
				a[row][col] = 5.2*row+(double)col;
			}
		}
		
		System.out.println();
	
		//Print out the array
		for(int row=0; row < a.length; row++)
		{
			for(int col = 0; col < a[row].length; col++)
			{
				System.out.printf("%.1f ", a[row][col]);
			}
			System.out.printf("%n");
		}
		
		System.out.println("\nIn the following example rows and columns are used incorrectly:");
		
		for (int row=0; row < a.length; row++)
		{
			for (int col = 0; col < a[row].length; col++)
			{
				//Mistake on next line of code. Swapped rows and columns.
				System.out.printf("%.1f ", a[col][row]);
			}
			System.out.printf("%n");
		}
	}
}