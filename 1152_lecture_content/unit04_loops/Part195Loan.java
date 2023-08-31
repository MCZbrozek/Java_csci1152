/* Write a program to calculate amount
owed on a loan over 10 years.

Correct output:
Year      Amount on deposit
1         $1,050.00
2         $1,102.50
3         $1,157.62
4         $1,215.51
5         $1,276.28
6         $1,340.10
7         $1,407.10
8         $1,477.45
9         $1,551.33
10        $1,628.89    */
public class Part195Loan
{
	public static void main(String[] args)
	{
		/* TODO: Declare and initialize 
		three double variables:
		amount, starting at 0
		principal, starting at 1000
		and rate, starting at 0.05. */
		
		System.out.printf("%-10s Amount on deposit\n", "Year");
		/* TODO: Write a for loop that initializes
		an int variable named year, starting at 1,
		and loops year up by 1 through 10.
		
		Put the following code inside the for loop:
			amount = principal * Math.pow(1+rate, year);
			System.out.printf("%-10s $%,.2f\n", year, amount);
		*/

	}
}
