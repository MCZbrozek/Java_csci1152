import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Part810ReadWords
{
	public static void main(String[] args)
	{
		/* The following is the typical way to
		generate a Scanner for file reading. */
		
		//Path p = Paths.get("C:\\Users\\nholtschulte\\Desktop\\Part810example.txt");
		Path p = Paths.get("Part810example.txt");
		Scanner fileIn = null;
		
		// checked exception
		try {
			fileIn = new Scanner(p);
		} catch (IOException e) {
			System.out.println("error IO exception: "+e.getMessage());
			System.exit(1);
		}
		
		readThreeWords(fileIn);
		//readAllWords(fileIn);
		//readAllLines(fileIn);
	}

	private static void readThreeWords(Scanner fileIn)
	{
		String readWord = "";
		if(fileIn.hasNext()){
			readWord = fileIn.next();
			System.out.println("readWord = "+readWord);
		}
		if(fileIn.hasNext()){
			readWord = fileIn.next();
			System.out.println("readWord = "+readWord);
		}
		if(fileIn.hasNext()){
			readWord = fileIn.next();
			System.out.println("readWord = "+readWord);
		}
	}
	
	private static void readAllWords(Scanner fileIn)
	{
		String readWord = "";
		while(fileIn.hasNext()){
			readWord = fileIn.next();
			System.out.println("readWord = "+readWord);
		}
	}

	private static void readAllLines(Scanner fileIn)
	{
		String line = "";
		while(fileIn.hasNextLine()){
			line = fileIn.nextLine();
			System.out.println("read line = "+line);
		}
	}
}
