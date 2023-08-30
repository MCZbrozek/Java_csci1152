import java.util.ArrayList;
/*
ArrayList is a Java class that's like
an array, but easier to change the size.

The String.split method is very useful
for processing text data. Much of the
following code is from here:
https://www.geeksforgeeks.org/split-string-java-examples/
*/
public class Part515StringSplit
{
	public static void main(String[] args)
	{
		String str = "nerds@and@geeks";
		System.out.println(str);
		System.out.println("Create an array of separate Strings\nby splitting on the @ symbol:");
		String[] arrOfStr = str.split("@");

		//Loop through the String array.
		for(int i=0; i<arrOfStr.length; i++)
		{
			System.out.println("str["+i+"] "+arrOfStr[i]);
		}
		System.out.println();
		
		
		String str2 = "nerds and geeks";
		System.out.println("\n"+str2);
		System.out.println("But it's more common to split on\na blank space:");
		arrOfStr = str2.split(" ");

		for(int i=0; i<arrOfStr.length; i++)
		{
			System.out.println("str2["+i+"] "+arrOfStr[i]);
		}

		
		// extra space
		String str3 = "nerds and  geeks";
		System.out.println("What if there's an extra space?");		
		System.out.println("\n"+str3);
		arrOfStr = str3.split(" ");

		for(int i=0; i<arrOfStr.length; i++)
		{
			System.out.println("str3[" + i + "] '" + arrOfStr[i] + "'");
		}
		
		
		String str4 = "nerds and  geeks";
		System.out.println("\n\nRegular expressions are powerful tools for matching and manipulating text data.");
		System.out.println("\n"+str4);
		System.out.println("Instead of splitting on \" \", we split on \"\\s\"");
		arrOfStr = str4.split("\\s");

		for(int i=0; i<arrOfStr.length; i++)
		{
			System.out.println("str4[" + i + "] '" + arrOfStr[i] + "'");
		}
		

		String str5 = "nerds and  geeks";
		System.out.println("\n"+str5);
		System.out.println("Here we split on \"\\s+\"");
		arrOfStr = str5.split("\\s+");

		for(int i=0; i<arrOfStr.length; i++)
		{
			System.out.println("str5[" + i + "] '" + arrOfStr[i] +"'");

		}
		
		
		System.out.println("\n\nHere's a weird String:");
		String line = "almost no restri\n\nctions whatsoever.  You may copy\t\t\t\tit, give it away\tor";
		System.out.println(line);
		System.out.println("...And we'll split it on \"\\W+\" and also collect the results in an ArrayList");
		
		String[] words = line.split("\\W+");
		ArrayList<String> wordList = new ArrayList<>();
		for(int i=0; i<words.length; i++)
		{
			System.out.println("str6[" + i + "] " + words[i]);
			
			wordList.add(words[i]);
		}
	}
}