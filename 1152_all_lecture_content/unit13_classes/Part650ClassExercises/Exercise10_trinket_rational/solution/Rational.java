
public class Rational
{
	//Instance variables
	private int numerator;
	private int denominator;
	
	//Constructors
	public Rational()
	{
		numerator = 0;
		denominator = 1;
	}
	public Rational(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public int getNumerator(){ return numerator; }
	public int getDenominator(){ return denominator; }
	
	public void printRational()
	{
		System.out.println(this);
	}
	
	@Override
	public String toString()
	{
		return numerator+"/"+denominator;
	}
	
	public void negate()
	{
		numerator = -numerator;
	}

	public void invert()
	{
		//swap
		int temp = numerator;
		numerator = denominator;
		denominator = temp;
	}
	
	public double toDouble()
	{
		return ((double)numerator) / ((double)denominator);
	}
	
	/*
	Write an instance method called add that takes a Rational number as an argument, adds it to this, and returns a new Rational object.
	*/
	public Rational add(Rational that)
	{
		int common_denominator = this.denominator * that.getDenominator();
		
		int new_numerator = this.numerator*that.getDenominator() + that.getNumerator()*this.denominator;
		
		Rational to_return = new Rational(new_numerator, common_denominator);
		
		return to_return;
	}
	
}
