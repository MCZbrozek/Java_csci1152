
public class Part790PrintDiagonal
{
	// Print the values along the diagonal of
	// the input array.
	public static void printDiagonal(int[][] arr)
	{
		/* Development notes:
		[0][0]
		[1][1]
		[2][2]
		stay in bounds both rows and columns
		5 x 2
		2 x 5
		*/
		int number_of_columns;
		int number_of_rows = arr.length;
		for(int i=0; i<number_of_rows; i++)
		{
			number_of_columns = arr[i].length;
			if(i >= number_of_columns)
				break;
			System.out.printf("%4d", arr[i][i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		int[][] array = {{5,6,7},
						 {8,9,1},
						 {1,2,3}};
		printDiagonal(array);

		int[][] array2 = {{1,6},
						  {8,8},
						  {1,2}};
		printDiagonal(array2);

		int[][] array3 = {{4,6,7},
						  {8,3,1}};
		printDiagonal(array3);
	}
}
