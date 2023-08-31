/* Fig. 6.12: InitArray.java from the book
Initializing two-dimensional arrays. */
public class Part775TwoDArrays
{
	// create and output two-dimensional arrays
	public static void main(String[] args)
	{
		// 2d arrays can be created with
		// values already in them like this
		// 2x3 array:
		int[][] array1 = { {1, 2, 3},
						   {4, 5, 6} };
		
		// Or they can be created empty like
		// this 2x3 array:
		int[][] array2 = new int[2][3];
		
		// Technically Java arrays don't have
		// to have the same length in each
		// row, but... gross, why would you
		// ever do this?
		int[][] array3 = { {1, 2},
						   {3},
						   {4, 5, 6} };
		
		System.out.print("Indexing into 2d arrays is like 1d arrays, but you need another index, also in square brackets.\nThe value in row 2, column 2 of array1 is: ");
		System.out.println(array1[1][1]);
		
		System.out.print("The value in row 3, column 1 of array3 is: ");
		System.out.println(array3[2][0]);
		
		
		//Put 99 in the first row, last column of array1
		array1[0][2] = 99;
		
		
		System.out.println("\nThe values in array1 by row are:");
		outputArray(array1); // displays array1 by row
		
		System.out.printf("%nValues in array3 by row are%n");
		outputArray(array3); // displays array2 by row
		
		/* TODO: Create a 2x2 array and fill it 
		with values, then use outputArray to
		print it out.*/
		
		
	}
	
	
	// output rows and columns of a two-dimensional array
	public static void outputArray(int[][] array)
	{
		// loop through array's rows
		for (int row = 0; row < array.length; row++) 
		{
			// loop through columns of current row
			for (int column = 0; column < array[row].length; column++)
			{
				System.out.printf("%3d",array[row][column]);
			}
			System.out.println();
		}
	}
} // end class

/*********************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and
 * Pearson Education, Inc. All Rights Reserved. * * *
 * DISCLAIMER: The authors and publisher of this book have used their *
 * best efforts in preparing the book. These efforts include the *
 * development, research, and testing of the theories and programs *
 * to determine their effectiveness. The authors and publisher make *
 * no warranty of any kind, expressed or implied, with regard to these *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or *
 * consequential damages in connection with, or arising out of, the *
 * furnishing, performance, or use of these programs. *
 ********************************************************/