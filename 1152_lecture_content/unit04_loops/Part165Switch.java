
public class Part165Switch
{
	public static void main(String[] args)
	{

		int month = 8;
		int numDaysInMonth = 0;

		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				numDaysInMonth = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				numDaysInMonth = 30;
				break;
			case 2:
				numDaysInMonth = 28;
				break;
			default:
				System.out.println("Invalid month.");
				break;
		}
		System.out.println("Number of Days = " + numDaysInMonth);
	}
}
