/* This example shows the best way to print
values in an array so that our code can
change over time. */
public class Part350Arrays
{
	public static void main(String[] args)
	{
		double[] array = {4.5, 6.7, 8.7, 1.2};
		
		//Small brain
		System.out.print(array[0]+"  ");
		System.out.print(array[1]+"  ");
		System.out.print(array[2]+"  ");
		System.out.print(array[3]+"  ");
		System.out.println();
		
		//Medium brain
		int i = 0;
		System.out.print(array[i]+"  ");
		i++;
		System.out.print(array[i]+"  ");
		i++;
		System.out.print(array[i]+"  ");
		i++;
		System.out.print(array[i]+"  ");
		System.out.println();
		
		//Big brain
		for (i=0; i < 4; i++) {
			System.out.print(array[i]+"  ");
		}
		System.out.println();
		
		//Galaxy brain
		for (i=0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
		System.out.println();
		
		
		/* TODO: Write a for loop that sums
		up all the values in array. Print out
		the result. Refer to the earlier example
		if you need to. */
		
		
	}
}
