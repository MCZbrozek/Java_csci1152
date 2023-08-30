import java.util.Scanner;

//https://www.w3schools.com/java/java_switch.asp

public class Part175Switch
{
	public static void main(String[] args) 
	{
		Scanner input; //declaration
		input = new Scanner(System.in); //initialization
		System.out.println("Give the name of the day. Ex: Monday");
		String day = input.nextLine();
		
		switch (day)
		{
			case "Monday":
				System.out.println(1);
				break;
			case "Tuesday":
				System.out.println(2);
				break;
			case "Wednesday":
				System.out.println(3);
				break;
			case "Thursday":
				System.out.println(4);
				break;
			case "Friday":
				System.out.println(5);
				break;
			case "Saturday":
				System.out.println(6);
				break;
			case "Sunday":
				System.out.println(7);
				break;
			default:
				System.out.println("Is that the name of a day?");
		}
		input.close();
	}
}