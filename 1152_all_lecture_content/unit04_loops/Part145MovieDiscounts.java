import java.util.Scanner;

public class Part145MovieDiscounts
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Age: ");
		int age_of_person = sc.nextInt();
		
		double movie_ticket_price = 10.5;
		if (age_of_person > 60)
		{
			//Reduce price by 10%
			movie_ticket_price = .9*movie_ticket_price;
		}
		
		/* TODO: extend this example with two
		else ifs. If the age is over 70 then
		the price reduction is 25%. If the 
		person is over 80 then the price 
		reduction is 50%.
		
		Actually, you may wish to change the
		    if (age_of_person > 60)
		to an else if and start with the "over 80"
		condition. The order of the ifs and else
		ifs matters! */
		
		System.out.printf("Movie Ticket Price is $%.2f\n",movie_ticket_price);
		
		sc.close();

	}
}
