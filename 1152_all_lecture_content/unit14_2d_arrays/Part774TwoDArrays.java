public class Part774TwoDArrays
{
	public static void main(String[] args)
	{
		//Initialize array
		int[][] matrix = {
			{7,2},
			{1,5},
			{3,2}
		};

		System.out.println("number of rows: "+matrix.length);

		System.out.println("number of columns in row 1: "+matrix[0].length);
		
		int row_count = matrix.length;
		int col_count = matrix[0].length; //Assuming all rows have the same number of columns as the first row
		
		for(int row=0; row<row_count; row++)
		{
			for(int col=0; col<col_count; col++)
			{
				System.out.println("   "+matrix[row][col]);
				//System.out.printf("%d\t", matrix[row][col]);
			}
			//System.out.println("\n");
		}

		//Count the twos
		int two_count = 0;
		for(int row=0; row<row_count; row++)
		{
			for(int col=0; col<col_count; col++)
			{
				if(matrix[row][col] == 2)
				{
					System.out.println("Found a two: "+matrix[row][col]);
					two_count = two_count + 1;
				}
				else
				{
					System.out.println("  Not what we want: "+matrix[row][col]);
				}
			}
		}
		System.out.println("Found this many twos: "+two_count);

	}
}
