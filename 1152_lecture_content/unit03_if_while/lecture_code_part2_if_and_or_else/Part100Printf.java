/* System.out.printf was demonstrated earlier
in the course, but that only scratched the
surface. Here we dive deeper. */
public class Part100Printf
{
	public static void main(String[] args)
	{
		System.out.printf("Number: %8d\n", 3);
		System.out.printf("Number: %8d\n", 2837);
		System.out.printf("Number: %8d\n", 12);
		System.out.printf("Number: %8d\n", 845);
		System.out.printf("Number: %8d\n", 12865324);
		System.out.printf("Number: %8d\n", 1286534324);
		
		System.out.printf("Number: %08d Hello\n", 313);
		
		System.out.printf("Number: %-8d Hello\n", 48);
		System.out.printf("Number: %-8d Hello\n", 2837);
		System.out.printf("Number: %-8d Hello\n", 12);
		System.out.printf("Number: %-8d Hello\n", 845);
		
		System.out.printf("Welcome to %15s, friend\n", "Santa Fe");
		System.out.printf("Welcome to %15s, friend\n", "Brussels");
		System.out.printf("Welcome to %15s, friend\n", "Madrid");
		
		System.out.printf("Welcome to %-15s, friend\n", "Santa Fe");
		System.out.printf("Welcome to %-15s, friend\n", "Brussels");
		System.out.printf("Welcome to %-15s, friend\n", "Madrid");
		
		System.out.printf("Number: %f\n", 3.1415);
		System.out.printf("Number: %8.2f\n", 3.1415);
		System.out.printf("Number: %8.2f\n", 58.32715);
		System.out.printf("Number: %6.5f\n", 207.0);
		
		
		//Variable placeholders?
		//Careful, monsters lurk below.
		//This did not work for me. I will explain
		//what I was going for and then move past it.
		/*
		String placeholder = "%8.2f";
		float f = 207.0f;
		System.out.printf("Number using variable placeholder: "+placeholder+"\n", f);
		
		String s = Float.toString(f);
		System.out.println("The value of the variable f as a string is "+s);
		int length = s.length();
		System.out.println("The length of the string is "+length);
		placeholder = "%"+Integer.toString(length)+"f";
		System.out.println("Placeholder all by itself: '"+placeholder+"'");
		//What is going on? Why is this inconsistent with the above?
		System.out.print("Number: "+placeholder+"\n");
		System.out.printf("Number: "+placeholder+"\n", f);
		*/
		
		
		System.out.printf("Balance: $%10.2f\n", 58.32715);
		System.out.printf("Balance: $%10.2f\n", 238.1656);
		/* TODO: Follow along while I demonstrate
		the use of String.format to create properly
		formatted output with the dollar sign. */
		
	}
}