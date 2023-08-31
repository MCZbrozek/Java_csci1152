/*
The following can be used to test
your Rational class. Correct output
will look like this:

0/1
0/1
2/3
0.6666666666666666
-2/3
3/-2
13/-10

*/
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