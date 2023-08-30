import java.util.Scanner;

public class DynamicArrayIntro
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int response;
		int[] number_list = new int[3];
		int index = 0;
		
		do{
			System.out.println("Enter a positive integer. A negative number will end the program");
			response = sc.nextInt();
			
			number_list[index] = response;
			System.out.println("Here are your values: ");
			printArray(number_list, index);
			
			index++;
			
			//Is the array full?
			if(index >= number_list.length){
				//We're gonna need a bigger array
				number_list = copy(number_list, number_list.length +1);
			}
			
			System.out.println("You have room for "+(number_list.length-index)+" more values.");
			
		}while(response >= 0);
	}

	/* Pre: 
	   Post: Prints the values in the given array up to the given index. */
	public static void printArray(int[] numbers, int index){
		for(int i=0; i<=index; i++)
			System.out.println("  numbers["+i+"] = "+numbers[i]);
	}
	
	/* Pre: 
	   Post: Returns an integer array of the given length with
	   the values of from_array copied into the new array. */
	public static int[] copy(int[] from_array, int length)
	{
		int[] to_array = new int[length];
		for(int i=0; i<from_array.length; i++)
		{
			to_array[i] = from_array[i];
		}
		return to_array;
	}
	
}
