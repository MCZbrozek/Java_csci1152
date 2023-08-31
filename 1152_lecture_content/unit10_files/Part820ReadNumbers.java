/* Compare and contrast 815ReadNumbers with this
version. */
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;

public class Part820ReadNumbers
{
	public static void main(String[] args)
	{
		//Path p = Paths.get("C:\\Users\\nholtschulte\\Desktop\\java_code\\Part815numbers.txt");
		Path p = Paths.get(args[0]);
		
		Scanner fileIn = null;
		
		// checked exception
		try {
			fileIn = new Scanner(p);
		}
		catch (IOException e) {
			System.out.println("Input Output Exception");
			e.printStackTrace();
			System.exit(2);
		}
		
		try{
			int number;
			while(fileIn.hasNext())
			{
				//number = fileIn.next();
				number = fileIn.nextInt();
				System.out.println("number = "+number);
			}
		}catch (InputMismatchException e) {
			System.out.println("Input does not match an integer");
			System.exit(3);
		}
	}

}
