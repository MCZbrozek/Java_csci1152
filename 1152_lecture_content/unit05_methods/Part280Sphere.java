// Exercise 6.6: Sphere.java from the textbook.
// Calculate the volume of a sphere.
import java.util.Scanner;

public class Part280Sphere
{
	// obtain radius from user and display volume of sphere
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter radius of sphere: ");
		double radius = input.nextDouble();

		double volume = 0;
		/* TODO: Write a line of code to call the
		sphereVolume method. Pass the radius to
		the method and capture the result of the
		method in the volume variable. */
		
		
		System.out.printf("Volume is %f%n", volume);
	} // end method determineSphereVolume


	// calculate and return sphere volume
	public static double sphereVolume(double radius)
	{
		double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		return volume;
	} // end method sphereVolume


} // end class

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
