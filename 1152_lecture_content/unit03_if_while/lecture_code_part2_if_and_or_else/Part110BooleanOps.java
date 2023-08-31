public class Part110BooleanOps
{
	public static void main(String[] args)
	{
		/* Now that we've got if and while -
		that is, control mechanisms that
		execute code based on a true or
		false evaluation - we may need
		operations to combine true and
		false in logical ways. */
		
		boolean result;
		
		// And &&
		System.out.println("Truth Table for And");
		result = true && true;
		System.out.println("true && true is "+result);
		result = true && false;
		System.out.println("true && false is "+result);
		result = false && true;
		System.out.println("false && true is "+result);
		result = false && false;
		System.out.println("false && false is "+result);

		System.out.println();

		// Or ||
		System.out.println("Truth Table for Or");
		result = true || true;
		System.out.println("true || true is "+result);
		result = true || false;
		System.out.println("true || false is "+result);
		result = false || true;
		System.out.println("false || true is "+result);
		result = false || false;
		System.out.println("false || false is "+result);
		
		System.out.println();

		// Not !
		System.out.println("Truth Table for Not");
		result = !true;
		System.out.println("!true is "+result);
		result = !false;
		System.out.println("!false is "+result);
		
	}
}