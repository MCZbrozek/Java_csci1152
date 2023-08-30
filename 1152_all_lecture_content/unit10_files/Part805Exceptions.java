/* Exceptions and the use of try-catch is
particularly important when dealing with
reading data from files. */
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Part805Exceptions
{
	/* If an exception is not handled with a try
	catch, then the method that generates the
	exception must be marked as
	"throws [exception name]"
	*/
	public static String getWord2() throws IOException
	{
		//Full path:
		//Path p = Paths.get("C:\\Users\\nholtschulte\\Desktop\\Part805example.txt");
		
		//Local path
		Path p = Paths.get("Part805example.txt");

		// This next line throws IOException
		Scanner sc = new Scanner(p);

		//Read in three words, but only return
		//the third word.
		String word = sc.next();
		word = sc.next();
		word = sc.next();
		sc.close();
		return word;
	}

	/* getWord2 throws an exception. Until it
	gets dealt with the exception continues up
	the chain. */
	public static String getWord1() throws IOException
	{
		String word = "";
		word = getWord2();
		return word;
	}

	public static void main(String[] args)
	{
		String word = "";
		//This try-catch finally handles the exception.
		try {
			word = getWord1();
		} catch (IOException e) {
			System.out.println("error invalid path: "+e.getMessage());
			e.printStackTrace();
			System.exit(1);
		}
		System.out.println("calc = " + word);
	}

}
