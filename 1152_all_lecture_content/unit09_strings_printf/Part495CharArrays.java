/* A String is a character array with 
support. That extra support comes in the
form of methods such as charAt, compareTo,
indexOf and many more that can be found here:
docs.oracle.com/en/java/javase/16/docs/api/java.base/java/lang/String.html
*/
public class Part495CharArrays
{
	public static void main(String[] args)
	{
		char[] arrayOfChars = {'a','b','c','d','e'};
		
		//What does this print?
		System.out.println("array = "+arrayOfChars[2]);
		
		//Strings have their own "contains" method.
		//What would it look like to write our own?
		boolean hasE = contains(arrayOfChars, 'e');
		System.out.println("Does the array contain 'e'? "+hasE);
		
		//Strings have their own "indexOf" method.
		//What would it look like to write our own?
		int index = indexOf(arrayOfChars, 'e');
		System.out.println("'e' is at position: "+index);
	}

	//return true or false if search char is in my array
	public static boolean contains(char[] array, char search)
	{
		for (int i=0; i < array.length; i++)
		{
			if (search == array[i])
			{
				return true;
			}
		}
		return false;
	}

	//search for character and return the index where we found it
	public static int indexOf(char[] array, char search)
	{
		for (int i=0; i < array.length; i++)
		{
			if (search == array[i])
			{
				return i;
			}
		}
		return -1;
	}
}
