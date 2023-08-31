import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Part815ReadNumbers
{
	public static void main(String[] args)
	{
		//path = Paths.get("C:\\Users\\nholtschulte\\Desktop\\java_code\\Part815numbers.txt");
		Path path = Paths.get("Part815numbers.txt");
		
		Scanner fileIn = null;
		
		//The following try catch does double duty,
		//handling two different exceptions.
		try {
			fileIn = new Scanner(path);

			int number;
			/* hasNextInt can be used to detect if
			the next read from file is formatted
			as an integer */
			while(fileIn.hasNextInt())
			{
				/* nextInt can be used to read directly
				into an integer format. */
				number = fileIn.nextInt();
				System.out.println("number = "+number);
			}
		}
		catch (java.io.IOException e) {
			System.out.println("Input Output Exception");
			System.exit(2);
		}
		/* nextInt throws InputMismatchException
		which needs to be caught. */
		catch (java.util.InputMismatchException e) {
			System.out.println("Input did not match");
			System.exit(3);
		}
	}

}
