
public class DynamicArray
{
	private String[] array;
	private int size;
	
	public DynamicArray(int capacity) {
		array = new String[capacity];
		size = 0;
	}
	public DynamicArray() {
		this(5);
	}

	public int size() {
		return size;
	}
	public void set(int index, String value) {
		array[index] = value;
	}
	public String get(int index) {
		return array[index];
	}
	public void add(String value) {
		if (size == array.length) {
			//need more space
			String[] newArray = new String[array.length*2];
			ArrayUtils.copyArray(array, newArray);
			array = newArray;
		}
		//we have enough space
		array[size++] = value;
	}
	
	public void add(String value, int index) {
		if (size == array.length) {
			//need more space
			String[] newArray = new String[array.length*2];
			ArrayUtils.copyArray(array, newArray);
			array = newArray;
		}
		ArrayUtils.shiftDown(array, index, size);
		array[index] = value;
	}
	
	public void remove(int index) {
		ArrayUtils.shiftUp(array, index, size);
	}
	
	
	
	
	
	public static void main(String[] args)
	{
		DynamicArray darray = new DynamicArray(5);
		
		for (int i=0;i < 30; i++) 
			darray.add(""+i);
		
		for (int i=0;i < darray.size(); i++) 
			System.out.print(darray.get(i)+"   ");
		
	}

}
