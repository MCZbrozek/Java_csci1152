
public class Part531Recursion
{
	public static void whatHappens()
	{
		whatHappens();
		System.out.println("Does this ever print?");
	}
	
	public static void main(String[] args)
	{
		whatHappens();
	}

}