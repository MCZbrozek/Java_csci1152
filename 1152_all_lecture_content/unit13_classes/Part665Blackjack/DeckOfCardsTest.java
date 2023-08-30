// Fig. 7.13: DeckOfCardsTest.java
// Card shuffling and dealing.
import java.util.Scanner;

public class DeckOfCardsTest
{
	// execute application
	public static void main(String[] args)
	{
		DeckOfCards myDeckOfCards = new DeckOfCards();


		// print all 52 Cards in order
		for (int i = 1; i <= 52; i++)
		{
			// deal and display a Card
			System.out.printf("%-19s", myDeckOfCards.dealCard());

		 if (i % 4 == 0) // output a newline after every fourth card
			 System.out.println();
		}



		myDeckOfCards.shuffle(); // place Cards in random order



		PlayerHand player1 = new PlayerHand();

		//Draw two cards
		Card c = myDeckOfCards.dealCard();
		player1.draw(c);
		player1.draw( myDeckOfCards.dealCard() );

		System.out.println(player1);
		
		
		Scanner user_input = new Scanner(System.in);
		String choice;
		do
		{
		System.out.println("hit or stay?");
		choice = user_input.next();
		if(choice.equals("hit"))
		{
			player1.draw( myDeckOfCards.dealCard() );
		}
		System.out.println(player1);
		}while(choice.equals("hit") && !player1.isBusted());
		
		if(player1.isBusted())
		{
			System.out.println("Busted!");
		}
		else if(18 < player1.getHandValue())
		{
			System.out.println("You won!");
		}
		else
		{
			System.out.println("Oooo sorry the house had 18!");
		}
		user_input.close();
	}
} // end class DeckOfCardsTest

/*******************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and 
 * Pearson Education, Inc. All Rights Reserved.
 * DISCLAIMER: The authors and publisher of this book have used their		*
 * best efforts in preparing the book. These efforts include the			 *
 * development, research, and testing of the theories and programs			*
 * to determine their effectiveness. The authors and publisher make		 *
 * no warranty of any kind, expressed or implied, with regard to these	 *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or		 *
 * consequential damages in connection with, or arising out of, the		 *
 * furnishing, performance, or use of these programs.
****************************************************/