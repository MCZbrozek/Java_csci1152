import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class StringArrayList
{
	public static void main(String[] args)
	{
		Scanner fileInput = null;
		try {	
			Path path = Paths.get("info.txt");
			fileInput = new Scanner(path);
		} catch (java.io.IOException exc) {
			System.out.println("IO Exception");
			System.exit(1);
		}
		
		ArrayList<String> allWordsInFile = new ArrayList<>();
		
		while(fileInput.hasNext()) {
			String word = fileInput.next();
			allWordsInFile.add(word);
		}
		
		//enhanced for loop to print all items in list
		for (String word : allWordsInFile) {
			System.out.println("word from for each loop = "+word);
		}

		System.out.println();
		System.out.println();
		System.out.println();

		//for loop to print all items in in list
		for (int i =0; i < allWordsInFile.size(); i++) {
			System.out.println("word at index "+i+" = "+allWordsInFile.get(i));
		}

		System.out.println();
		System.out.println();
		System.out.println();

		//Iterator
		Iterator<String> iter = allWordsInFile.iterator();
		while(iter.hasNext()){
			System.out.println("word from iterator = "+iter.next());
		}
	}
}
