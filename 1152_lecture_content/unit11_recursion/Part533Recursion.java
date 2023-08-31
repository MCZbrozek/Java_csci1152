
public class Part533Recursion
{
	public static void whatHappens(int i)
	{
		if (i == 0) {
			return;
		} else {
			System.out.println("repeat i = "+i);
			i = i - 1;
			whatHappens(i);
		}
	}

	public static void main(String[] args)
	{
		whatHappens(10);
	}

}