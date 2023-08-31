import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Part835ReadInfo
{
	public static void main(String[] args)
	{
		//path = Paths.get("C:\\Users\\nholtschulte\\Desktop\\java_code\\Part835info.txt");
		Path path = Paths.get("Part835info.txt");
		
		Scanner fileIn = null;
		
		// checked exception
		try {
			fileIn = new Scanner(path);
		}
		catch (java.io.IOException e) {
			System.out.println("Input Output Exception");
			System.exit(2);
		}
		
		try {
			int number;
			while(fileIn.hasNextInt())
			{
				number = fileIn.nextInt();
				System.out.println("number = "+number);
			}
			
			String text;
			text = fileIn.next();
			System.out.println("text = "+text);

			text = fileIn.next();
			System.out.println("text = "+text);

			text = fileIn.nextLine();
			System.out.println("text line = '"+text+"'");

			text = fileIn.nextLine();
			System.out.println("text line = '"+text+"'");
		}
		catch (java.util.InputMismatchException e) {
			System.out.println("Input did not match");
			System.exit(3);
		}
	}

}
