public class Part295Scope
{
	public static void main(String[] args)
	{
		//Meet Tom. Tom is your neighbor.
		//He is an int with value 5.
		int Tom = 5;

		System.out.println("Neighborhood Tom in main is "+Tom);

		//Call a method.
		doStuff();

		System.out.println("Neighborhood Tom is not affected by doStuff: "+Tom);

		//Call another method and pass Tom's info to it.
		doOtherStuff(Tom);

		System.out.println("Neighborhood Tom is STILL not affected by the method: "+Tom);

		//Call a method and capture the result in Tom
		Tom = getAnInt(Tom);

		System.out.println("Neighborhood Tom is finally affected by the method because Tom was used to grab the result: "+Tom);
	}

	
	public static void doStuff()
	{
		//This is a different Tom who lives
		//in a totally different neighborhood.
		//He has never met the other Tom.
		int Tom = 6425;
		Tom = Tom + 5;
		Tom = Tom/2;
		System.out.println("Totally different Tom in doStuff has a different value: "+Tom);
	}


	public static void doOtherStuff(int Tom)
	{
		System.out.println("The input is a copy of the information from main. This Tom in doOtherStuff is a twin of the Tom in main, but they are not 'the same person': "+Tom);

		//Changing Tom here has no affect on the Tom in main.
		Tom = Tom - 872;
		Tom = Tom*46;
	}


	//The name of the variable used to recieve
	//input does not matter beyond the boundaries
	//of the method itself.
	public static int getAnInt(int Hank)
	{
		return 4*Hank+3-Hank/5;
	}
	
} // end class
