
public class Car
{
	//Attributes are variables that belongs to an object
	//also known as instance variables
	private int speed;
	private String make;
	private String model;

	//constructor
	public Car(int speed, String make, String model)
	{
		this.speed = speed;
		this.make = make;
		this.model = model;
	}
	
	//A method is a function that belongs to an object.
	//"static" is not used.
	public String getInfo()
	{
		return this.make+" "+this.model+" with speed "+this.speed;
	}
	
	//"setters" are methods that are used to modify
	//the value of private instance variables.
	//Many IDEs will auto-generate getters and setters.
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	public void setMake(String make)
	{
		this.make = make;
	}

	/* TODO: Write the third setter method, that 
	will take a String as input and set the value
	of the model instance variable. */
	
	
}