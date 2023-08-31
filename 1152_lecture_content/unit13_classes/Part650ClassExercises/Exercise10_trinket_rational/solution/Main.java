public class Main
{
	public static void main(String args[])
	{
		Rational r = new Rational();
		r.printRational();
		System.out.println(r);

		Rational rat = new Rational(2, 3);
		rat.printRational();
		System.out.println(rat.toDouble());
		rat.negate();
		rat.printRational();
		rat.invert();
		rat.printRational();
		
		
		Rational new_rational = new Rational(1, 5);
		Rational result = rat.add(new_rational);
		System.out.println(result);
	}
	

}