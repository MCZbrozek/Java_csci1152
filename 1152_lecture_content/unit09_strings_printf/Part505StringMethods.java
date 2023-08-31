public class Part505StringMethods
{
	public static void main(String[] args)
	{
		String myStr1 = "CNM 1152";
		
		int length = myStr1.length();

		System.out.println("myStr1 length = " + length);

		char theChar = myStr1.charAt(2);

		System.out.println("myStr1 char at 2 = " + theChar);

		// comparing strings
		String name1 = "Joe Shmo";
		String name2 = "John Q";

		// 0 if equal
		// - if name1 is lexigraphically less than name2
		// + if name1 is lexigraphically greater than name2
		int compareReturn = name1.compareTo(name2);

		System.out.println("When "+name1+" is compared to "+name2+" the result is "+compareReturn);


		// compare to
		String str3 = "Mark";
		String str4 = "Mark";

		int isEqual = str3.compareTo(str4);
		// 0 if equal
		// - if str3 is lexigraphically less than
		// + if str3 is lexigraphically greater than
		System.out.println("When "+str3+" is compared to "+str4+" the result is "+isEqual);


		boolean endsWithmo = name1.endsWith("mo");
		System.out.println("Does "+name1+" end with \"mo\"? " + endsWithmo);


		System.out.println("\nThe substring method is useful for extracting subsets of a String.");
		String variable = "unhappy";
		System.out.println( variable.substring(2) ); // returns "happy"
		System.out.println("Harbison".substring(3) );// returns "bison"
		System.out.println( "emptiness".substring(1, 4) );// returns "mpt"

		String line = "Once upon a time there was a monster.";
		System.out.println("\n"+line);

		int i = line.indexOf('o');
		System.out.println("Index of o is "+i);

		i = line.lastIndexOf('o');
		System.out.println("Last index of o is "+i);

		i = line.indexOf("nce");
		System.out.println("Index of nce is "+i);

		i = line.indexOf('e', 5);
		System.out.println("Index of e after the 5th character is "+i);


		// How do I find multiple occurences 
		// of the same string?
		System.out.println("Where are all the e's?");
		int oValue = line.indexOf("e");
		while (oValue != -1)
		{
			System.out.print(oValue + "   ");
			oValue = line.indexOf("e", oValue + 1);
		}
	}
}