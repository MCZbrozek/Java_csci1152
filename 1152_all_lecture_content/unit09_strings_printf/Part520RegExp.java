/* Source:
https://javarevisited.blogspot.com/2017/01/string-replaceall-example-how-to-replace-all-characters-and-substring.html
*/
public class Part520RegExp
{
	public static void main(String[] args)
	{
		System.out.println();

		String bestseller = "clean code";
		String alternative = bestseller.replaceAll("e", "a");

		System.out.println("orginal string: " + bestseller); // print clean code
		System.out.println("replaced string: " + alternative); // print claan coda

		System.out.println();
		

		String sample = "123 123 123 123 321";
		String replaced = sample.replaceAll("123", "1111");
		System.out.println("orginal string: " + sample); // print 123 123 123 123 321
		System.out.println("replaced string: " + replaced); // print 1111 1111 1111 1111 321

		System.out.println();


		// 3rd example - replacement using regular expression 
		// the first argument you pass its regular expression 
		// you can use this to replace all white space from
		// string as shown below
		String textWithWhitespace = "Java is   gre	at";
		String changed = textWithWhitespace.replaceAll("\\s+", "");
		System.out.println("orginal string: " + textWithWhitespace);
		System.out.println("replaced string: " + changed);

		System.out.println();

	}

}
