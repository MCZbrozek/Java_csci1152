
public class Main
{
	//static makes a method available regardless
	//as to whether we have an object or not.
	public static void main(String[] args)
	{
		Rectangle r;
		r = new Rectangle(2, 4);
		
		Rectangle r2 = new Rectangle(100, 200);
		
		int area = r.calculateArea();
		System.out.println("r's area is "+area);
		r.stretch(5);
		area = r.calculateArea();
		System.out.println("r's area is "+area);
		
		area = r2.calculateArea();
		System.out.println("r2's area is "+area);
		
		area = Rectangle.calculateArea(5,3);
		System.out.println("5x3 rectangle has area "+area);
		
		/*
		TODO: If you run the following three lines of code, is box2 null or not? See if you can test your answer.
		
		Rectangle box1 = new Rectangle(50,100);
		Rectangle box2 = box1;
		box1 = null;


		TODO: In the code below, why does calling   grow(50, 50);  on box1 change box2?
		
		Rectangle box1 = new Rectangle(50,100);
		Rectangle box2 = box1;
		box1.grow(50, 50);
		*/
	}

}