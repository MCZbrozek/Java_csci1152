/*
This class demonstrates a method that removes
the first and last rows and columns from a
given matrix and it kind-of-works on 2d arrays
with different length rows.
The "kind-of" is because the method returns
a resulting matrix in which all rows have the
same length.
*/
public class Part801CutOffCrust2
{
	/* Pre: All the rows in arr have the same length.
	Post: A copy of arr will be returned minus
	the first and last row, and minus the first 
	and last column. */
	public static int[][] cutOffCrust(int[][] arr)
	{
		int rowCount = arr.length;
		
		//Find the maximum rowLength (same as
		//column count) after removing the
		//first and last column
		int rowLength = 0;
		for(int i=1; i<rowCount-1; i++)
		{
			if(arr[i].length-2 > rowLength)
				rowLength = arr[i].length-2;
		}

		int colCount = arr[0].length;
		//Instantiate a new matrix with 2 fewer rows and columns
		int[][] subarray = new int[rowCount-2][rowLength];
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
		int[][] result = {{5,6,7,9},
						  {8,9,3},
						  {1,2,3,4},
						  {9,}};

/*
Expecting:
	  {9},
	  {2,3},
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
