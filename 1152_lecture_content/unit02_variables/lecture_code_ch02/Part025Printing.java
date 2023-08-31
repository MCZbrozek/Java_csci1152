public class Part025Printing
{
	public static void main(String[] args)
	{
		int average = 5/2;
		
		//Quotation marks make all the difference.
		System.out.println("average");
		System.out.println(average);
		
		/* Texts are called "Strings" in computer
		programming.
		Strings can be joined with a plus sign.
		 + is "context sensitive". Plus works 
		differently when numbers are being
		operated on as compared to Strings. */
		System.out.println("Average = "+average);
		
		//Numbers are automatically converted
		//to Strings by Java when a number is
		//joined to a String with +
		double avg = 5/2.0;
		System.out.println("Average = "+avg);
		
		//You can join as many values together
		//as you like and there are special
		//symbols too.
		System.out.println("Average "+avg+"\t"+average);
		System.out.print("Average "+avg+"\n"+average);
		
		System.out.println("Here's how to use \"scare\" quotes.");
		
		//Blank spaces are sometimes confusing.
		//Look how I inserted a blank between 
		//numbers and words.
		int x = 99;
		int y = 54;
		System.out.println(x+" "+y+" are two numbers.");

		String firstName = "Neal";
		String lastName = "Holtschulte";
		/*TODO: Fix the mistake in the next line
		so that the first and last name are separated
		by a space. */
		System.out.println("Full name: "+firstName+""+lastName);

		/*TODO: What is the error that displays when 
		the next line of code is uncommented? Answer 
		in this comment: */
		//System.out.println(firstName+" goes by Mr. "lastName+" but not really.");
		//TODO: Fix the mistake on the previous line.
		
	}
}
