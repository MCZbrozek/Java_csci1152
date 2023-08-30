import java.util.Stack;

public class StackExample
{

	public static void main(String[] args)
	{
		//Compare the following to an ArrayList declaration
		//ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		
		//Compare to adding data to an ArrayList
		//list.add(12);
		//list.add(2);
		stack.push(1);
		stack.push(2);
		stack.push(3);

		Integer x = stack.pop();
		
		System.out.println("x = "+x);

		Integer y = stack.pop();
		
		System.out.println("y = "+y);
	}

}
