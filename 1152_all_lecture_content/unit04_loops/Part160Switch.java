/*
Switch Statement
https://www.w3schools.com/java/java_switch.asp

Switch with flowcharts:
https://www.javatpoint.com/java-switch
*/
public class Part160Switch
{
	public static void main(String[] args)
	{
		int month = 5;
		String monthString; //null
		switch (month)
		{
			case 1:
				monthString = "January";
				break;
			case 2:
				monthString = "February";
				break;
			case 3:
				monthString = "March";
				break;
			case 4:
				monthString = "April";
				break;
			case 5:
				monthString = "May";
				break;
			case 6:
				monthString = "June";
				break;
			case 7:
				monthString = "July";
				break;
			case 8:
				monthString = "August";
				break;
			case 9:
				monthString = "September";
				break;
			case 10:
				monthString = "October";
				break;
			case 11:
				monthString = "November";
				break;
			case 12:
				monthString = "December";
				break;
			default: //otherwise else
				monthString = "Invalid month";
				break;
		} //ends the switch
		System.out.println(monthString);
		
		
		//The above is exactly the same as
		//the following:
		if(month == 1)
		{
			monthString = "January";
		}
		else if(month == 2)
		{
			monthString = "February";
		}
		else if(month == 3)
		{
			monthString = "March";
		}
		else if(month == 4)
		{
			monthString = "April";
		}
		else if(month == 5)
		{
			monthString = "May";
		}
		else if(month == 6)
		{
			monthString = "June";
		}
		else if(month == 7)
		{
			monthString = "July";
		}
		else if(month == 8)
		{
			monthString = "August";
		}
		else if(month == 9)
		{
			monthString = "September";
		}
		else if(month == 10)
		{
			monthString = "October";
		}
		else if(month == 11)
		{
			monthString = "November";
		}
		else if(month == 12)
		{
			monthString = "December";
		}
		else
		{
			monthString = "Invalid month";
		}
		System.out.println(monthString);
		
	}
}