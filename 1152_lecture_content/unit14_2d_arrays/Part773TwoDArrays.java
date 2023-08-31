/* Here we will learn how to create and
manipulate two dimensional arrays. */
public class Part773TwoDArrays
{
	public static void main(String[] args)
	{
		// 2d arrays can be created with
		// values already in them like this
		// 3x3 array:
		int[][] matrix = {
			{7,2,5},
			{1,5,0},
			{3,2,8}
		};

		System.out.println(matrix[2][1]); //What does this print?

		System.out.println(matrix[0][2]); //What does this print?

		System.out.println(matrix[0][0]); //What does this print?
		

		// Two dimensional arrays can also be created
		// empty like this 2x2 array:
		int[][] m2d = new int[2][2];


		System.out.println();
		
		
		int[] onedim = matrix[0];
		System.out.println("Row 0 column 1 of matrix: "+onedim[1]);


		int x = matrix[2][2];
		System.out.println(x); //What does this print?

		x = matrix[matrix.length-1][matrix[0].length-1];
		System.out.println(x); //What does this print?
		
		//Easier to read:
		int r = matrix.length-1;
		int c = matrix[0].length-1;
		x = matrix[r][c];

		System.out.println(matrix.length); //What does this print?

		//System.out.println(matrix[3][0]); //What does this print?
		
		
		
		// Here is a 5x3 array populated with
		// values using nested for loops.
		int[][] matrix2 = new int[5][3];
		for(int row=0; row<matrix2.length; row++)
		{
			for(int column=0; column<matrix2[row].length; column++)
			{
				matrix2[row][column] = row*column;
			}
		}

		//Print the array
		for(int row=0; row<matrix2.length; row++)
		{
			for(int column=0; column<matrix2[row].length; column++)
			{
				//System.out.println(matrix2[row][column]);
				//System.out.printf("%4d\n", matrix2[row][column]);
				System.out.printf("%4d", matrix2[row][column]);
			}
			System.out.println();
		}


		System.out.println(matrix2[4][2]); //What does this print?

		System.out.println(matrix2[0][0]); //What does this print?
		
		x = matrix2[3][2];
		System.out.println(x); //What does this print?

		x = matrix2[matrix.length-1][matrix[0].length-1];
		System.out.println(x); //What does this print?

		System.out.println(matrix2.length); //What does this print?

		System.out.println(matrix2[0].length); //What does this print?

		//System.out.println(matrix2[3][18]); //What does this print?
		
	}
}
