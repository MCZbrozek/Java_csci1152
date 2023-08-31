/* There are many good reasons to nest
conditions inside of loops. */
public class Part245LoopAndIf
{
	public static void main(String[] args)
	{
		//Here is one way to print all the
		//odd numbers from 0 through 49
		for(int i=0; i<50; i++)
		{
			if(i%2==1)
			{
				System.out.printf("%5d",i);
			}
		}
		System.out.println("\n========================\n");
		//Although there is perhaps an easier
		//way to do the same thing:
		for(int i=1; i<50; i+=2)
		{
			System.out.printf("%5d",i);
		}
		
		System.out.println("\n========================\n");

		//Suppose we want to print all the
		//factors of 5 or 7 from 0 through 49
		for(int i=0; i<50; i++)
		{
			if(i%5==0 || i%7==0) {
				System.out.printf("%5d",i);
			}
		}

		System.out.println("\n========================\n");

		//Suppose we want to print all the
		//factors of 5 AND 7 from 0 through 49
		for(int i=0; i<49; i++)
		{
			if(i%5==0 && i%7==0)
				System.out.printf("%5d",i);
		}

		System.out.println("\n========================\n");

		/* TODO: Write a loop that goes from
		-20 to 20 in steps of 1 and prints all
		the values that are negative or
		multiples of 3 */
		
		
		System.out.println("\n========================\n");

		//The following loop prints all the
		//even values in the array
		int values[] = {8,2,-5,1,4,-4,3,-6,1,-9,-1,2};
		for(int i=0; i<values.length; i++)
		{
			if(values[i]%2==0)
			{
				System.out.printf("%5d", values[i]);
			}
		}

		System.out.println("\n========================\n");

		//TODO: Write a loop to print all the
		//negative values from the array.
		
		
	}
}