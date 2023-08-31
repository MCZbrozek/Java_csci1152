
public class Part500StringEquality
{
	public static void main(String[] args)
	{
		//Strings can be instantiated (created)
		//in a few different ways:
		String construct1 = new String("contructor");
		String construct2 = "no constructor";
		char[] data = { 'c', 'h', 'a', 'r', ' ', 'd', 'a', 't', 'a' };
		String construct3 = new String(data);

		System.out.println(construct1);
		System.out.println(construct2);
		System.out.println(construct3);
		
		System.out.println("\n========================\n");

		// use dot notation to call methods on
		// the String object...
		// <object name>.<method name>
		// ...the same as all other objects
		String s = "string";
		int index = s.indexOf("t");
		System.out.println("The position of \"t\" in "+s+" is "+index);


		System.out.println("\n========================\n");


		System.out.println("Comparing Strings can be tricky. Would you say that the following Strings are equal? Would Java say they are equal?");
		String bob1 = "hello bob";
		String bob2 = new String("hello bob");
		String bob3 = "hello bob";

		if (bob1 == bob2) {
			System.out.println("bob1 is equal bob2");
		}
		else {
			System.out.println("bob1 is NOT equal to bob2");
		}

		if (bob1 == bob3) {
			System.out.println("bob1 is equal bob3");
		}
		else {
			System.out.println("bob1 is NOT equal to bob3");
		}

		System.out.println("\nStrings should be compared using a method named equals:");
		if ( bob1.equals(bob2) )
		{
			System.out.println("bob1 has the same value as bob2");
		}
	}
}