/* Source:
https://www.vogella.com/tutorials/JavaRegularExpressions/article.html
*/
public class Part525StringMatcher
{
	// returns true if the string matches exactly "true"
	public static boolean isTrue(String s){
		return s.matches("true");
	}
	// returns true if the string matches exactly "true" or "True"
	public static boolean isTrueVersion2(String s){
		return s.matches("[tT]rue");
	}

	// returns true if the string matches exactly "true" or "True"
	// or "yes" or "Yes"
	public static boolean isTrueOrYes(String s){
		return s.matches("[tT]rue|[yY]es");
	}

	// returns true if the string contains exactly "true" or "True"
	public static boolean containsTrue(String s){
		return s.matches(".*[tT]rue.*");
	}


	// returns true if the string contains exactly three letters
	public static boolean isThreeLetters(String s){
		return s.matches("[a-zA-Z]{3}");
		// simpler from for
		//	  return s.matches("[a-Z][a-Z][a-Z]");
	}



	// returns true if the string does not have a number at the beginning
	public static boolean isNoNumberAtBeginning(String s){
		return s.matches("^[^\\d].*");
	}
	
	// returns true if the string contains a arbitrary number of characters except b
	public static boolean isIntersection(String s){
		return s.matches("([\\w&&[^b]])*");
	}
	
	// returns true if the string contains a number less than 300
	public static boolean isLessThanThreeHundred(String s){
		//return s.matches("[^0-9]*[12]?[0-9]{1,2}[^0-9]*");
		return s.matches("^[12]?[0-9]{0,2}$"); //Holt's implementation
	}

	public static void main(String[] args)
	{
		System.out.println();

		String truthiness = "True";
		String affirmative = "Yes";
		String buried_truth = "--safnTrueeeedkbv";
		System.out.println(isTrue(truthiness)); //false
		System.out.println(isTrueVersion2(truthiness)); //true
		System.out.println(isTrueVersion2(affirmative)); //false
		System.out.println(isTrueOrYes(affirmative)); //true
		System.out.println(isTrueOrYes(truthiness)); //true
		System.out.println(isTrueOrYes(buried_truth)); //false
		System.out.println(containsTrue(buried_truth)); //true
		System.out.println(containsTrue("trueksubdv9y3b")); //true
		System.out.println(containsTrue("b8264c3hTrue")); //true
		
		System.out.println();
		
		
		
		boolean result = isLessThanThreeHundred("75924");
		System.out.println("Is 75924 less than 300? "+result); //false

		result = isLessThanThreeHundred("224");
		System.out.println("Is 224 less than 300? "+result); //true

		result = isLessThanThreeHundred("a224");
		System.out.println("Is a224 less than 300? "+result); //false

		result = isLessThanThreeHundred("2");
		System.out.println("Is 2 less than 300? "+result); //true

		result = isLessThanThreeHundred("");
		System.out.println("Is \"\" less than 300? "+result); //Holt's implementation says true, but should be false
	}
}