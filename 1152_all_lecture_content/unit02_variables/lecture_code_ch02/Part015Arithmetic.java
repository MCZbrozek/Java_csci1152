//ARITHMETIC
public class Part015Arithmetic
{
	public static void main(String[] args)
	{
		/* Java supports many basic arithmetic operations.
		+ addition
		- subtraction
		* multiplication
		/ division
		
		Exponents, roots, absolute value, and more may require the Math library, which we will get to later.
		*/
		System.out.println();
		
		int sumOfTen = 5+5;
		System.out.print("sumOfTen = 5+5 == ");
		System.out.println(sumOfTen);
		
		double result = 4.0/6*(5-2);
		System.out.print("result = 4.0/6*(5-2) == ");
		System.out.println(result);
		
		//Calculations can (and will usually) involve variables.
		int x = 7;
		int y = 6;
		int z = x*y + 4;
		
		z = sumOfTen-1;
		//spaces around arithmetic operators are optional
		result = result*result + z*2;
		System.out.print("result*result + z*2 == ");
		System.out.println(result);
		
		//Use parentheses to specify the order of operations, otherwise, calculations will be made as established in math class.
		result = (4.0/6)*(5-2);
		System.out.println("(4.0/6)*(5-2) = "+result);
		
		//TODO: Is (4.0/6)*(5-2) different from 4.0/6*(5-2) ???
		//Should it be? Answer in a comment.
		
		
		/*TODO: I want to add 5 and 7, then divide
		the result by 4, and put the result of that
		in a variable named month. Write a line of
		code to accomplish the task AND print it
		out. */
		
		
		System.out.println();
		
		//There two types of decimal values: floats and doubles.
		
		//floats are a bit old fashioned and 'weird'.
		//We will not use them.
		float f = (float)3433434343343434.0;
		float ff = 21.0f; //note the f
		System.out.println("A float: "+f);
		System.out.println("Another float: "+ff);
		
		//We will use doubles instead.
		double d = 3433434343343434.0;
		double dd = 21.0;
		System.out.println("A double: "+d);
		System.out.println("Another double: "+dd);
		
		
		System.out.println();
		
		//Integers also come in different sizes.
		//Let's talk memory for a moment:
		
		//Bytes vs bits
		//bit is 1 or 0
		//8 bits to a byte
		
		//long 64 bits (or 8 bytes)
		//int 32 bits (4 bytes)
		//short 16 bits (2 bytes, only numbers from -32,768 to 32,767)
		
		/* TODO: Follow along and fill in the 
		blanks as we look at the size 
		limitations of integers. */
		short myShort = (short)40000; //change
		int myInt = (int)2147483649L; //change
		long myLong = 2147483649L; //change
		
		System.out.println("myShort was assigned 40000, but displays "+myShort);
		System.out.println("myInt was assigned 2147483649L, but displays "+myInt);
		System.out.println("myLong was assigned 2147483649L, but displays "+myLong);


		System.out.println();
		
		//Variables regularly appear on both sides 
		//of an assignment statement.
		x = 2;
		x = x+1;
		//TODO: What is the value of x printed here?
		System.out.println("Value of x: "+x);
		
		//The following is not a mathematically
		//valid statement:
		//    x = x+1
		//It IS a programmatically valid statement.
		//Not only is it valid, but it is common.
		
		//Change x to be one larger than its previous value:
		x = x + 1;
		
		//Change x's value to be double its previous value:
		x = x*2;
		
		//TODO: Write a line to change x's value to be half its most recent value.
		
		System.out.println("Value of x after more changes: "+x);
		
		
		//Circle area
		double pi = 3.14159;
		double radius = 3;
		/*TODO: The area of a circle is equal 
		to pi * the radius squared. Initialize 
		a double type variable named area to 
		the correct value based on pi and 
		radius. Then print out area. */
		
		
		System.out.println();
		
		//INTEGER DIVISION:

		//What happens when dividing integers results in a decimal value?
		z = 5/2; //z is an integer.
		d = 5/2; //d is a double
		//TODO: What is the value of z printed here?
		System.out.println("Value of z: "+z);
		//TODO: What is the value of d printed here?
		System.out.println("Value of d: "+d);

		//z = 5.0 / 2; //z is an integer. //NOTE TO SELF: This causes an error: incompatible types: possible lossy conversion from double to int
		d = 5 / 2.0; //d is a double
		//TODO: What is the value of z printed here?
		System.out.println("Value of z: "+z);
		//TODO: What is the value of d printed here?
		System.out.println("Value of d: "+d);


		System.out.println();

		//One last bit of practice.
		result = 5*6/6*5; //is this 1 or 25?
		System.out.println("1 or 25? Answer: "+result);
		
		/* TODO: Write a line of code to set 
		result equal to this calculation 
		5*6/6*5
		but with parentheses added in so that
		the other result is printed. 
		(If it first printed 1, make it print 25
		or vice versa.) */
		
		System.out.println("The other result: "+result);

	}
}
