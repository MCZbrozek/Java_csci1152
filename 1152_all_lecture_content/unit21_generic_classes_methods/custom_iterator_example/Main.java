/*
Here's an example of what the code inside an iterator might look like and how to initialize and return an object from inside another object.

It's also an example of a silly custom data structure named JumbledList though such a data structure might have an application in a situation in which we want to shuffle our data.
*/
public class Main
{
	public static void main(String[] args)
	{
		JumbledList my_mess = new JumbledList();
		
		my_mess.add("loose change");
		my_mess.add("paper clips");
		my_mess.add("pocket lint");
		my_mess.add("pens & pencils");
		my_mess.add("paper scraps");
		my_mess.add("receipts");
		
		CustomIterator iter = my_mess.getIterator();
		System.out.println("Here are the values in the data structure:");
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		System.out.println("\nRemoving the following values:");
		
		System.out.println(my_mess.remove());
		System.out.println(my_mess.remove());

		iter = my_mess.getIterator();
		System.out.println("\nHere are the remaining values in the data structure:");
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
}