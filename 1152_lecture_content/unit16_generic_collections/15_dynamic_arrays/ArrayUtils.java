public class ArrayUtils
{
	public static char[] replace(char[] array, char oldChar, char newChar)
	{
		char[] newArray = new char[array.length];
		for (int i=0; i < array.length;i++)
		{
			if (array[i] == oldChar) 
				newArray[i] = newChar;
			else
				newArray[i] = array[i];
		}
		return newArray;
	}
	public static int lastIndexOf(char[] array, char searchChar)
	{
		for (int i=array.length-1; i >= 0; i--)
		{
			if (array[i] == searchChar) return i;
		}
		return -1;
	}
	public static int indexOf(char[] array, char searchChar)
	{
		for (int i=0; i < array.length; i++)
		{
			if (array[i] == searchChar) return i;
		}
		return -1;
	}
	public static boolean arrayEquals(char[] array1, char[] array2)
	{
		if (array2.length != array1.length) return false;
		for (int i=0; i < array1.length; i++)
		{
			if (array1[i] != array2[i]) return false;
		}
		return true;
	}
	public static boolean arrayEquals(String[] array1, String[] array2)
	{
		if (array2.length != array1.length) return false;
		for (int i=0; i < array1.length; i++)
		{
			if ((array1[i] != null && array2[i] == null) ||
			array1[i] == null && array2[i] != null)
				return false;
			if (array1[i] == null && array2[i] == null)
				continue;
			if (!array1[i].equals(array2[i]))
				return false;
		}
		return true;
	}
	
	//add methods for copyArray,shiftValuesDown for all primitive data types
	
	public static void copyArray(String[] from, String to[])
	{
		if (to.length < from.length) return;
		for (int i=0; i < from.length; i++)
		{
			to[i] = from[i];
		}
		
	}
	
	public static int shiftDown(String[] array, int size)
	{
		return shiftDown(array, 0, size);
	}
	
	public static int shiftDown(String[] array, int stopIndex, int size)
	{
		//Assume array has enough length.
		//size contains how many element stored in array
		for (int i=size-1; i >=stopIndex;i--)
		{
			array[i+1] = array[i];
		}
		array[stopIndex]=null;
		size++;
		return size; 
	}
 
	public static int shiftUp(String[] array, int startIndex, int size)
	{
		//Assume array has enough length.
		//size contains how many element stored in array
		for (int i=startIndex; i < size; i++)
		{
			array[i] = array[i+1];
		}
		size--;
		return size; 
	}

	public static String[] setup()
	{
		String[] array = {"a", "b", "c", null,null,null,null };
		return array;
	}
	
	public static void main(String[] args)
	{
		String[] array = setup();
		int size = 3;
		
		//test shiftValuesDown
		size = shiftDown(array, 3);
		
		String[] expected = {null,"a", "b", "c", null,null,null};
		
		if (!arrayEquals(expected, array)) System.out.println("shiftDown(char[], int) failed.");
		
		array = setup();
		size = shiftDown(array, 1, 3);
		
		String[] expected2 = {"a", null, "b", "c", null,null,null};
		
		if (!arrayEquals(expected2, array)) System.out.println("shiftDown(char[],int,int) failed.");
	
		//test shiftValuesUp
		array = setup();
		size = shiftUp(array, 0, 3);
		
		String[] expectedShift = {"b", "c", null,null,null,null,null};
	 
		if (!arrayEquals(expectedShift, array)) System.out.println("shiftUp(char[], int,int) failed.");
	
		array = setup();
		size = shiftUp(array, 2, 3);
		
		String[] expectedShift2 = {"a","b", null,null,null,null,null};
	 
		if (!arrayEquals(expectedShift2, array)) System.out.println("shiftUp(char[], int,int) failed.");
	
		//test copy
		array = setup();
		String[] copiedToArray = new String[array.length];
		
		copyArray(array, copiedToArray);
				
		if (!arrayEquals(array, copiedToArray)) System.out.println("copy(char[], char[]) failed.");
		
		//test replace
		array = setup();//reset array
		char[] replaceArray = {'a', 'b', 'c', 'b','\0', '\0', '\0'};
		char[] newArray = replace(replaceArray, 'b', 'X');
		char[] expected3 = {'a', 'X', 'c', 'X','\0', '\0', '\0', };
		
		if (!arrayEquals(expected3, newArray)) System.out.println("replace(char[],char,char) failed.");
	}

}
