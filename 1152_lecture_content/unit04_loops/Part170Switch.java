import java.util.Scanner;

//https://www.w3schools.com/java/java_switch.asp

public class Part170Switch
{
	public static void main(String[] args) 
	{
		Scanner input; //declaration
		input = new Scanner(System.in); //initialization
		System.out.println("Give the number of the day. Monday is 1");
		int day = input.nextInt();
		
		switch(day)
		{
			case 1:
				System.out.println("Monday");
				System.out.println("Case of the Mondays");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Number does not match a day.");
		}
		input.close();
	}
}