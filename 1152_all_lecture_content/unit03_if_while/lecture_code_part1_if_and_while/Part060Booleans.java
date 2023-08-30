public class Part060Booleans
{
	public static void main(String[] args)
	{
		//Web Source:
		//w3schools.com/java/java_booleans.asp
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);  //Outputs true
		System.out.println(isFishTasty);//Outputs false
		
		int x = 10;
		int y = 9;
		System.out.println(x > y); // returns true, because 10 is higher than 9

		x = 10;
		System.out.println(x == 10); // returns true, because the value of x is equal to 10
		
		System.out.println(x == 15); // returns false, because x is not equal to 15
		
		
		boolean is_true = true;
		if(is_true)
		{
			System.out.println("This always prints "+is_true);
		}
		
		x = 8;
		y = 0;
		if(x >= y)
		{
			System.out.println("x >= y");
		}
		
		if(isGreater(10,5))
		{
			System.out.println("is it greater? yes");
		}
		
		/* TODO: Write an if statement that checks
		if x is greater than y and if true, 
		sets x equal to half its previous value. */
		
		
	} // end method main

	//The following is a method. We'll learn much
	//more about methods later.
	public static boolean isGreater(int a, int b)
	{
		return a > b;
	}
}
