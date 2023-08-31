public class Part105SpecialChars
{
	
	public static void main(String[] args)
	{
		/* There are a variety of special
		characters in Java, but here I'm going to
		demonstrate the most common ones. */
		
		//www.w3schools.com/java/java_strings_specchars.asp
		/* TODO: Answer in a comment, what error do
		you get when you uncomment the following. */
		//String wrong = "We are the so-called "Vikings" from the north.";
		
		//Here is the correct way to do it.
		String txt = "We are the so-called \"Vikings\" from the north.";
		System.out.println(txt);
		
		txt = "The character \\ is called backslash.";
		System.out.println(txt);
		
		System.out.println("Tabs\tare\tregularly\tused\tin\tspacing.");
		
		/* TODO: Display the following text
		using only one String or println.
		Note that Hans is bracketed by tabs:
		
		The House Atreides Suite "Dune 2021"
		by	Hans	Zimmer
		combines Gaelic\Arabic\Mongolian Music
		*/
		
	}
}