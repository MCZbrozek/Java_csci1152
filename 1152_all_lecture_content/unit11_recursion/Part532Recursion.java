
public class Part532Recursion
{
	public static void whatHappens()
	{
		System.out.println("Does this ever print?");
		whatHappens();
	}
	
	public static void main(String[] args)
	{
		whatHappens();
	}

}