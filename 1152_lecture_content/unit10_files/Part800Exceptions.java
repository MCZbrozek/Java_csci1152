//In this example a stacktrace is printed.
public class Part800Exceptions {
	
	public static int method2() {
		int calc =0;
		calc = 54/0;
		return calc;
	}

	public static int method1() {
		int calc = 0;
		calc = method2();
		return calc;
	}
	
	public static void main(String[] args) {
		int calc = 0;
		try {
			calc = method1();
		} catch(ArithmeticException exc)	{
			System.out.println("error in main");
			System.out.println(exc.toString());
			exc.printStackTrace();
		}
		System.out.println("calc = "+calc);
	}

}
