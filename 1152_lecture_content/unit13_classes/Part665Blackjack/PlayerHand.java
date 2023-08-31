
public class PlayerHand
{
	private final int HANDLIMIT = 10;
	private Card[] hand = new Card[HANDLIMIT];
	private int card_count = 0;

	
	public void draw(Card c)
	{
		//If there is room in the hand
		if(card_count < HANDLIMIT)
		{
			//Put the card in the card array
			hand[card_count] = c;
			//and advance card_count to point to the next empty space
			card_count++;
		}
		else
		{
			System.out.println("Couldn't draw a card because of a full hand.");
		}
	}
	
	public int getHandValue()
	{
		int value = 0;
		for(int i=0; i<card_count; i++)
		{
			value += hand[i].getValue();
		}
		return value;
	}
	
	public boolean isBusted()
	{
		return 21 < getHandValue();
	}

	public String toString()
	{
		String s = "\nCards in hand with value "+getHandValue()+":\n";
		for(int i=0; i<card_count; i++)
		{
			s += hand[i].toString()+"\n";
		}
		return s;
	}
}