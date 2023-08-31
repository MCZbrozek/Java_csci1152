import java.util.Scanner;
/*
The goal of the following program is to ask
the user for their age then apply a senior
discount to the ticket price if the person
is over 60.
*/
public class Part065IfPractice
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Age: ");
		//TODO: Change the next line of code. Instead
		//of setting the value to 0, set the value
		//to an integer read in through the scanner.
		int age_of_person = 0;
		
		double movie_ticket_price = 10.5;
		//TODO: Write an if with condition on the
		//next line that checks if the age if greater
		//than 60.
		
		{
			movie_ticket_price = .9*movie_ticket_price;
		}
		System.out.printf("Movie Ticket Price is %.2f\n",movie_ticket_price);
		//TODO: What is the ticket price for a person
		//over 60? Answer in a comment.
		
		sc.close();
	}
}
