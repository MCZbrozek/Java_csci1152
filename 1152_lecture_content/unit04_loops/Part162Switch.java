/* Here is yet another technique that is
redundant with stuff you already know. I will
not be testing you on switches. */
import java.util.Scanner;

public class Part162Switch
{
	public static void main(String[] args)
	{
		int grade = 72;
		
		//This set of ifs and else ifs does
		//the same work as the switch that follows.
		if(grade >= 90) {
			System.out.println("You got an A");
		}else if (grade >= 80) {
			System.out.println("You got an B");
		}else if (grade >= 70) {
			System.out.println("You got an C");
		}else if (grade >= 60) {
			System.out.println("You got an D");
		} else {
			System.out.println("You got an F");
		}
		
		grade = grade/10;
		
		switch(grade) {
		case 10:
		case 9:
			System.out.println("You got an A");
			break;
		case 8:
			System.out.println("You got an B");
			break;
		case 7:
			System.out.println("You got an C");
			break;
		case 6:
			System.out.println("You got an D");
			break;
		default:
			System.out.println("You got an E");
			break;
		}
	} // end main
} // end class
