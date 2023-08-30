
public class Main
{
	public static void main(String[] args)
	{
		Car my_car; //declare a car variable
		
		//instantiate means "create an 
		//instance of the class"
		
		//initialize an instance of Car
		my_car = new Car(70, "Toyota", "Corolla");
		//and another
		Car car2 = new Car(120, "Ford", "Mustang");
		//and another
		Car car3 = new Car(80, "Geo", "Metro");
		
		String car_info = my_car.getInfo();
		System.out.println(car_info);

		System.out.println(car2.getInfo());

		System.out.println(car3.getInfo());
		
		/* TODO: Instantiate a fourth car and
		print out its info */
		
		
		System.out.println("\n========================\n");
		
		
		//Arrays
		Car[] car_array = new Car[3]; //declare an empty array of 3 cars
		car_array[0] = my_car;
		car_array[1] = car2;
		car_array[2] = car3;
		
		for(int i=0; i<car_array.length; i++)
		{
			System.out.println(car_array[i].getInfo());
		}
	}
}