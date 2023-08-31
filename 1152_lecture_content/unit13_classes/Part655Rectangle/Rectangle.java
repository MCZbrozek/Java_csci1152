public class Rectangle //a class is a blueprint
{
	private int length;
	private int width;
	
	//constructor takes a blue print and constructs
	//an intance of the class known as an object.
	public Rectangle(int l, int w)
	{
		length = l;
		width = w;
	}
	
	public int calculateArea()
	{
		return length * width;
	}
	
	public void stretch(int multiple)
	{
		length = length * multiple;
		width = width * multiple;
	}
	
	/*TODO: Write a method named grow that
	takes two integer inputs and increases
	the length and width by the input values
	using addition. In other words, if
	length is 5 and width is 12 beforehand,
	then after grow(5,6) is called, length
	will be 10 and width will be 18. */
	
	
	public static int calculateArea(int l, int w)
	{
		return l*w;
	}
	
}