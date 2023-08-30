/*
This class demonstrates a method that removes
the first and last rows and columns from a
given matrix and it works on 2d arrays
with different length rows!
*/
public class Part803CutOffCrust3
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
		//Instantiate a new matrix with 2 fewer rows
		//and no columns. Columns will have to be
		//customized because they can vary row-to-row
		int[][] subarray = new int[rowCount-2][0];
		for(int i=1; i<arr.length-1; i++)
		{
			//Calculate the length of the current
			//row (with a minimum of zero)
			int temp = arr[i].length-2;
			if(temp<0)
				temp = 0;
			//Declare a new one-dimensional
			//integer array to hold the current
			//row's values (except for the first
			//and last column).
			int[] justThisRow = new int[temp];
			//Copy the current row (other than
			//first and last value) into "justThisRow"
			for(int j=1; j<arr[i].length-1; j++)
			{
				justThisRow[j-1] = arr[i][j];
			}
			//Set the sub array's current row equal
			//to the one-dimensional array containing
			//the row values
			subarray[i-1] = justThisRow;
		}
		return subarray;
	}
	
	public static void main(String[] args)
	{
		int[][] result = {{5,6,7,9},
						  {8,9,3},
						  {1,2,3,4},
						  {9},
						  {3,7,3,5,6},
						  {3,7,3,5,6}};

/*
Expecting:
{9},
{2,3},
{},
{7,3,5},
*/
		
		result = cutOffCrust(result);
		
		
		
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
