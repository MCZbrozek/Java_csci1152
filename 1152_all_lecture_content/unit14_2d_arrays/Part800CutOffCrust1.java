/*
This example and the next two were created in front of students because there was time available and I wanted to demonstrate more 2d array examples. Students asked about matrices with different length rows and so that was investigated in the next two examples.
In future semesters you could create this from scratch again, or talk through it, or just provide it as more neat examples.

This class demonstrates a method that removes
the first and last rows and columns from a
given matrix.
*/
public class Part800CutOffCrust1
{
	/* Pre: All the rows in arr have the same length.
	Post: A copy of arr will be returned minus
	the first and last row, and minus the first 
	and last column. */
	public static int[][] cutOffCrust(int[][] arr)
	{
		//Get the original matrix's row and column count
		int rowCount = arr.length;
		int colCount = arr[0].length;
		//Instantiate a new matrix with 2 fewer rows and columns
		int[][] subarray = new int[rowCount-2][colCount-2];
		//Copy the inner values from arr into subarray
		for(int i=1; i<arr.length-1; i++)
		{
			for(int j=1; j<arr[i].length-1; j++)
			{
				subarray[i-1][j-1] = arr[i][j];
			}
		}
		return subarray;
	}
	
	public static void main(String[] args)
	{
		int[][] array = {{5,6,7,9},
						 {8,9,1,3},
						 {1,2,3,4},
						 {0,5,1,0}};
		
		int[][] result = cutOffCrust(array);
		
		
		
		for(int i=0; i<result.length; i++)
		{
			for(int j=0; j<result[i].length; j++)
			{
				System.out.printf("%5d", result[i][j]);
			}
			System.out.println();
		}
	}
}
