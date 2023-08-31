
public class Part130Else
{
	public static void main(String[] args)
	{
		//Source: https://www.w3schools.com/java/java_conditions.asp
		int time = 20;
		if (time < 18)
		{
			System.out.println("Good day.");
		} else {
			System.out.println("Good evening.");
		}
		// Outputs "Good evening."


		//Source: https://www.javatpoint.com/java-if-else
		//defining a variable
		int number=13;
		//Check if the number is divisible by 2 or not
		if(number%2==0){
			System.out.println("even number");
		}else{
			System.out.println("odd number");
		}


		//Source: https://www.javatpoint.com/java-if-else
		int year=2020;
		/* Compare to this much more
		readable alternative:
		boolean a = year % 4 ==0;
		boolean b = year % 100 !=0;
		boolean c = year % 400==0;
		if( (a && b) || c )
		*/
		if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0))
		{
			System.out.println("LEAP YEAR");
		}
		else
		{
			System.out.println("COMMON YEAR");
		}
		
		/* TODO: Write an if and else that prints 
		either "okay" or "put on a coat" based on
		a temperature variable. You should also
		initialize temperature and use a condition
		that you think is reasonable. */
		
		
	}
}