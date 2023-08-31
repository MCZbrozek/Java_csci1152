
public class Part785TwoDArrayMethods
{
	public static void main(String[] args)
	{
		//2 rows, 3 columns
		int[][] ints = new int[2][3];
		//The following is a tedious way to
		//enter values into the array, but it
		//does work.
		ints[0][0]=5; ints[0][1]=1; ints[0][2]=0;
		ints[1][0]=2; ints[1][1]=7; ints[1][2]=4;
	
		int row = 0;
		int col = 1;
		int x = ints[row][col];
		System.out.printf("\nThe value at row %d column %d is %d.\n",row, col, x);
		
		
		System.out.println("\nThe isValid method takes a 2d array and two integers as input and returns true/false depending on whether or not the integers represent a valid row/column index:");
		System.out.println( isValid(ints,0,2) );
		System.out.println( isValid(ints,10,2) );
		System.out.println( isValid(ints,1,1) );
		System.out.println( isValid(ints,1,10) );
		
		//Access can be protected using the isValid method
		if(isValid(ints,10,2))
		{
			System.out.println(ints[10][2]);
		}
		
		
		System.out.println("\nThe getValue method takes a 2d array and two integers as input and returns the value at the given position after checking that the row/column indexes are valid:");
		System.out.println( getValue(ints,0,2) );
		System.out.println( getValue(ints,10,2) );
		System.out.println( getValue(ints,1,1) );
		System.out.println( getValue(ints,1,10) );
		
		System.out.println("\nThe sumAround method takes a 2d array and two integers as input and returns the sum of the values to the north, south, east, and west of the given row/column indexes:");
		System.out.println( sumAround(ints,0,2) );
		System.out.println( sumAround(ints,1,1) );
		System.out.println( sumAround(ints,0,0) );
		
		/* TODO: Write a method named getOrSwap 
		that takes a 2d array and two integers 
		as input. If the integers represent valid 
		row/column indexes, then return the value 
		at that location, otherwise the function 
		checks the validity of swapping the 
		indexes and returns that value, otherwise, 
		the function returns -1.
		For example, the ints array has the 
		following values:
		5 1 6
		2 7 4
		getOrSwap(ints, 1,1) returns 7
		getOrSwap(ints, 2,0) returns 6
		getOrSwap(ints, 0,2) returns 6
		getOrSwap(ints, 2,2) returns -1
		*/
		
	}

	/* Methods are meant to be composed into
	new useful methods.
	Organize your program in such a way that
	you can scaffold into greater complexity
	without becoming overwhelmed by complexity.
	*/
	
	// determine if the row,col indices parameters are valid
	public static boolean isValid(int[][] g, int row, int col)
	{
		if (row < 0)
			return false;
		else if (col < 0)
			return false;
		else if (row > g.length -1)
			return false;
		else if (col > g[row].length -1)
			return false;
		else
			return true;
	}
	
	//return the value at row, col
	public static int getValue(int[][] g, int row, int col)
	{
		if (isValid(g, row, col))
			return g[row][col];
		else
			return 0; //Is this acceptable?
	}


	//method that sums all the values around a given cell
	public static int sumAround(int[][] g, int row, int col)
	{
		return getValue(g, row-1, col)+//add top value
				getValue(g, row+1,col)+//add bottom value
				getValue(g, row, col+1)+//add right value;
				getValue(g, row, col-1);//add left value;
	}

}