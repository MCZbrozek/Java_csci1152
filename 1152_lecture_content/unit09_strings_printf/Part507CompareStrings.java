/*
compareTo example for use with sorting on the semester project.
*/
public class Part507CompareStrings
{
	public static void main(String[] args)
	{
		String[] words = {"cat", "in", "cat", "the", "car"};
		
		System.out.println("Compare "+words[0]+" to "+words[1]);
		printComparisons(words[0], words[1]);

		System.out.println("Compare "+words[0]+" to "+words[2]);
		printComparisons(words[0], words[2]);
		
		System.out.println("Compare "+words[0]+" to "+words[4]);
		printComparisons(words[0], words[4]);
	}
	
	public static void printComparisons(String word1, String word2)
	{
		if(word1.compareTo(word2) < 0){
			System.out.println("less than");
		}
		else if(word1.compareTo(word2) == 0){
			System.out.println("equal");
		}
		else{ //Out of order. Same as   word1.compareTo(word2) > 0
			System.out.println("greater than");
		}
	}
}