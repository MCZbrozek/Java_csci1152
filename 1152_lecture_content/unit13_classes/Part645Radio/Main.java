public class Main
{
	public static void main(String[] args)
	{
		Radio car_radio = new Radio();

		System.out.println(car_radio.getInfo());
		System.out.println(car_radio);
		System.out.println();
		
		/* TODO: Comment out the entire toString
		method in Radio.java. What does
		System.out.println(car_radio);
		print out when toString is commented?
		Answer in a comment. */
		
		car_radio.setVolume(63);
		car_radio.scan();
		
		System.out.println(car_radio.getInfo());
		System.out.println(car_radio);
		System.out.println();
		
		car_radio.setVolume(100);
		car_radio.scan();

		System.out.println(car_radio.getInfo());
		System.out.println(car_radio);
		System.out.println();
	}
}