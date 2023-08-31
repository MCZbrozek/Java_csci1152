
public class StaticDynamicArray
{
	public static String[] add(String[] array, String value, int size)
	{
		if (size == array.length) //if the array is full
		{
			//need more space
			String[] newArray = new String[array.length*2];
			ArrayUtils.copyArray(array, newArray);
			array = newArray;
		}
		//we have enough space
		array[size] = value;
		size++;
		return array;
	}
	
	
	public static String[] add(String[] array, String value, int index, int size)
	{
		if(size == array.length)
		{
			//need more space
			String[] newArray = new String[array.length*2];
			ArrayUtils.copyArray(array, newArray);
			array = newArray;
		}
		ArrayUtils.shiftDown(array, index, size);
		array[index] = value;
		return array;
	}
	
	public static String[] remove(String[] array, int index, int size)
	{
		ArrayUtils.shiftUp(array, index, size);
		return array;
	}
	
	
	public static void main(String[] args)
	{
		String[] names = {null,null,null};
		int namesSize = 0;
		
		names = add(names, "mark", namesSize++);
		String[] expected = {"mark", null, null};
		System.out.println(ArrayUtils.arrayEquals(expected, names));
		
		names = add(names, "joe", namesSize++);
		String[] expected2 = {"mark", "joe", null};
		System.out.println(ArrayUtils.arrayEquals(expected2, names));
 
		names = add(names, "mary", namesSize++);
		String[] expected3 = {"mark", "joe", "mary"};
		System.out.println(ArrayUtils.arrayEquals(expected3, names));
		
		names = add(names, "john", namesSize++);
		String[] expected4 = {"mark", "joe", "mary", "john", null, null};
		System.out.println(ArrayUtils.arrayEquals(expected4, names));
		
		names = add(names, "xxx", 2, namesSize++);
		String[] expected5 = {"mark", "joe", "xxx", "mary", "john", null};
		System.out.println(ArrayUtils.arrayEquals(expected5, names));
 
		names = add(names, "yyy", 0, namesSize++);
		String[] expected6 = {"yyy", "mark", "joe", "xxx", "mary", "john"};
		System.out.println(ArrayUtils.arrayEquals(expected6, names));
 
		names = add(names, "aaa", 4, namesSize++);
		String[] expected7 = {"yyy", "mark", "joe", "xxx", "aaa", "mary", "john", null,null,null,null,null};
		System.out.println(ArrayUtils.arrayEquals(expected7, names));
	
		names = remove(names, 4, namesSize++);
		String[] expected8 = {"yyy", "mark", "joe", "xxx", "mary", "john", null, null,null,null,null,null};
		System.out.println(ArrayUtils.arrayEquals(expected8, names));
	}

}
