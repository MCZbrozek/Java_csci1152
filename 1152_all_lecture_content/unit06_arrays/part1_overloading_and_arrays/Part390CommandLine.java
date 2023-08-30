/* You can only enter command line info
as Strings. Here's what to do if you need
numeric input instead. Run this program
with three integer inputs. */
public class Part390CommandLine
{
	public static void main(String[] args)
	{
		if (args.length != 3) {
			System.out.printf("Error: please re-enter the entire command, including%nthree integers to be compared. %n");
		}
		else //otherwise
		{
			//Translate three strings (text) to integers
			int first_num = Integer.parseInt(args[0]);
			int second_num = Integer.parseInt(args[1]);
			int third_num = Integer.parseInt(args[2]);
			//Print them out
			System.out.printf("Here are your numbers: %d %d %d %n", first_num, second_num, third_num);
		}
	}
}


