import java.util.ArrayList;
import java.util.Random;

public class JumbledList
{
	//Attributes
	private ArrayList<Object> data;
	private Random rand;

	public JumbledList() //constructor
	{
		this.data = new ArrayList<Object>();
		this.rand = new Random(); //instance of random class
	}
	
	public void add(Object item)
	{
		int int_random = rand.nextInt(data.size()+1);
		data.add(int_random, item);
	}
	
	public Object remove()
	{
		int int_random = rand.nextInt(data.size());
		return data.remove(int_random);
	}
	
	public CustomIterator getIterator()
	{
		return new CustomIterator(data);
	}
}