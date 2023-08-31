public class MyStack
{
	int[] data;
	int index;
	int capacity;
	
	public MyStack()
	{
		index = 0;
		capacity = 1;
		data = new int[capacity];
	}
	
	public void push(int value)
	{
		data[index] = value;
		index++;
		//Do we need to expand?
		if(index == capacity)
		{
			int[] temp = new int[capacity*2];
			for(int i=0; i<data.length; i++)
			{
				temp[i] = data[i];
			}
			data = temp;
			capacity = capacity*2;
		}
	}

	//This will throw an error if we pop too much.
	public int pop()
	{
		index--;
		return data[index];
	}



	public static void main(String[] args)
	{
		MyStack stack = new MyStack();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		Integer x = stack.pop();
		
		System.out.println("x = "+x);

		Integer y = stack.pop();
		
		System.out.println("y = "+y);
	}

}
