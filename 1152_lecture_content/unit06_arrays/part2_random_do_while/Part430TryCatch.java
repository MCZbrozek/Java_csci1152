/* I'm 99% certain this example is from the
book, but I lost track of the source.

This is a little preview of TryCatch,
a Java mechanism for responding to user
mistakes and other errors without quitting
the program. */
import java.util.Random;

public class Part430TryCatch
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		float[] floatArray = new float[3];
		for(int index=0; index<floatArray.length; index++)
		{
			floatArray[index] = rand.nextFloat();
		}

		try
		{
			floatArray[3] = 99.0f;
		} catch (ArrayIndexOutOfBoundsException exc)
		{
			//Execute code here if the exception occurs
			System.out.println("over ran the array");
			floatArray[0] = 99.0f;
		}
		
		System.out.println("Did I execute?");

		for(int index=0; index<floatArray.length; index++)
		{
			System.out.println("float "+index+" is "+floatArray[index]);
		}
	}
}
