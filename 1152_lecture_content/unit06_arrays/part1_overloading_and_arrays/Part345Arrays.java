public class Part345Arrays
{
	public static void main(String[] args)
	{
		//The C programming language demands
		//that the brackets appear on the right
		//side of the variable when you create
		//an array, but Java let's you put them
		//on the left too.
		int b[] = {-45, 6, 0}; // initializer list
		//This works too:
		int[] c = {-45, 6, 0}; // initializer list
		System.out.println("Length of c is "+c.length);
		
		//Let's try to always be consistent with
		//the brackets in order to develop good
		//habits.
		
		
		//Summing up values in an array
		double y[] = new double[2];
		y[0] = 6.5;
		y[1] = 3.4;
		double sum = 0;
		for(int i=0; i<y.length; i++)
		{
			sum = sum + y[i];
		}
		// y[0] + y[1];
		// 6.5 + 3.4
		System.out.println("sum of values in y is "+sum);

		
		//A char array and indexing:
		char myList[] = {'h','e','l','l','o'};
		char letter = myList[1];
		System.out.println("value = " + letter);
		letter = myList[myList.length-1];
		System.out.println("value = "+letter);
		
		//TODO: Write a line of code that prints
		//the 'h' from myList using indexing
		
		
	}
}

