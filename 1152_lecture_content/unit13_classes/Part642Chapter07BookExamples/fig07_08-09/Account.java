/* Fig. 7.8: Account.java
Account class with a double instance variable
balance and a constructor and deposit method
that perform validation.
*/
public class Account
{
	 // instance variables:
	private String name;
	private double balance;

	// Account constructor that receives two parameters
	public Account(String name, double balance)
	{
		this.name = name;

		// validate that the balance is greater
		// than 0.0; if it's not, instance
		// variable balance keeps its default
		// initial value of 0.0
		if (balance > 0.0)
			this.balance = balance;
	}

	// method that deposits (adds) only a valid
	// amount to the balance
	public void deposit(double depositAmount)
	{
		// if the depositAmount is valid
		if (depositAmount > 0.0) {
			// add it to the balance
			balance += depositAmount;
		}
	}

	// method returns the account balance
	public double getBalance()
	{
		return balance;
	}

	// method that sets the name
	public void setName(String name)
	{
		this.name = name;
	}

	// method that returns the name
	public String getName()
	{
		return name;
	}
	
} // end class Account


/***************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and
 * Pearson Education, Inc. All Rights Reserved.
 * DISCLAIMER: The authors and publisher of this book have used their	  *
 * best efforts in preparing the book. These efforts include the			 *
 * development, research, and testing of the theories and programs		  *
 * to determine their effectiveness. The authors and publisher make		 *
 * no warranty of any kind, expressed or implied, with regard to these	 *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or		 *
 * consequential damages in connection with, or arising out of, the		 *
 * furnishing, performance, or use of these programs.
*****************************************************/