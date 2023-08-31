import java.util.Scanner;

public class Part340Arrays
{
	public static void main(String[] args)
	{
		System.out.print("Tell me the array size (at least 3): ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		sc.close();

		int numbers[]; //declaration
		numbers = new int[size]; //initialization
		
		//populating the array with values:
		numbers[0] = 46;
		numbers[1] = -452;
		numbers[2] = 2;
		
		System.out.printf("Length is %d\n", numbers.length);
		
		//Print out all the values
		for(int i=0; i<numbers.length; i++)
		{
			System.out.println("value at index "+i+" is "+numbers[i]);
		}
		
		//Strings have a .length with
		//parentheses. Arrays don't use
		//parentheses.
		//Oof!
		String t = "jdshbvds";
		System.out.println(t.length());
	}
}
