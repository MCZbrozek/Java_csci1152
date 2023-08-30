/* In this class we will mostly be using 
static methods, meaning methods that are
independent of any particular object.

However, you already have experience
using non-static methods. */
import java.util.Scanner;

public class Part300StaticVsObjectMethods
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int result = input.nextInt();
		input.nextLine(); //flush newline from the buffer
		/* nextInt and nextLine are non-static
		methods. nextInt and nextLine belong to
		the Scanner variable named input. */

		System.out.print("\nEnter some text: ");
		String response = input.nextLine();
		System.out.print("You entered a string with length: " + response.length() + "\n");
		System.out.print("The first character of your text is: '" + response.charAt(0) + "'");
		/* length and charAt are non-static
		methods. length and charAt belong to
		the String variable named response.
		A different String variable will produce
		different results using methods of the
		same name. */

		String comparison = "What a bunch of gibberish.";
		System.out.print("\nYou entered a string with length: " + comparison.length() + "\n");
		System.out.print("The first character of your text is: '" + comparison.charAt(0) + "'");
		
		/* By comparison, static methods don't
		need a dot "." before the method name.
		Static methods are available without
		reference to a particular object. */
		String shorter = trimToFit(comparison, 10);
		System.out.println("\nTrimmed comparison: " + shorter);

		/* Unless the static method is in a
		different file, in which case the file 
		needs to be specified before the dot
		so Java knows where to look for it. */
		double v = Part305MethodErrors.sphereVolume(7.85);
		System.out.println("\nSphere volume: " + v);
		
	} // end main
	
	public static String trimToFit(String text, int limit)
	{
		if(text.length() < limit)
			return text;
		else
			return text.substring(0, limit);
	}
} // end class
