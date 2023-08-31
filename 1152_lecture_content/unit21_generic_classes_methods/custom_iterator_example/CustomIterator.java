import java.util.ArrayList;

public class CustomIterator
{
	//Attributes
	private ArrayList<Object> data;
	private int index = 0;
	
	public CustomIterator(ArrayList<Object> data) //constructor
	{
		this.data = data;
		index = 0;
	}
	
	public boolean hasNext()
	{
		return index < data.size();
	}
	
	public Object next()
	{
		index = index + 1;
		return data.get(index-1);
	}
}