import java.util.Scanner;

public class Part115BooleanOps
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("\nGive an age: ");
		int age = input.nextInt();
		
		//Is the age between 18 and 60?
		//Same as: if(age > 18 && age < 60)
		//Same as: if(18 < age && 60 > age)
		if(18 < age && age < 60)
		{
			System.out.println("age is in the middle");
		}
		
		//Is the age NOT between 18 and 60?
		//Same as: if( !(18 < age && age < 60) )
		//Same as: if(18 >= age || age >= 60)
		if(age <= 18 || 60 <= age)
		{
			System.out.println("age is less than 18 or greater than 60");
		}

		//Is the age less than 13 or exactly 77
		//or exactly 100?
		if(age < 13 || age == 77 || age == 100)
		{
			System.out.println("age is one of these weird values.");
		}
		
		/* TODO: Why does the following condition
		make no sense? Answer in a comment. */
		if(18 < age || age < 60)
		{
			System.out.println("That's just silly.");
		}

		/* TODO: Write an if statement that prints
		"teenage" if the age is between 13 and 19
		inclusive. */
		
		
		input.close();
	}
}