/* Every single Java program you've written
has had an array in it!
	String[] args
TODO: Compile this program and run it as follows.
Describe the difference between part 2 and part 3.
Answer in a comment:
1
	javac Part385CommandLine.java
2
	java Part385CommandLine
3
	java Part385CommandLine Hello 7 okay 3.14
*/
public class Part385CommandLine
{
	public static void main(String[] args)
	{
		System.out.printf("Total number of args: %d\n",
			args.length);
		
		//The following is a bad idea because there
		//might not be any arguments (aka inputs).
		//System.out.printf("Index 0: %s%n", args[0]);
		//System.out.printf("Index 1: %s%n", args[1]);
		
		//This is a better way to print the inputs.
		for(int i=0; i<args.length; i++)
		{
			System.out.printf("Index %d: %s\n", i, args[i]);
		}
	}
}