public class WrapperExample1
{
	public static void main(String[] args)
	{
		int i = 10;
		Integer intWrapper = new Integer(i);
		System.out.println(intWrapper);
		
		Float floatWrapper = new Float(5.0);
		
		Long longWrapper = new Long(10);
		
		Boolean boolWrapper = new Boolean(true);
		
		float f = intWrapper.floatValue();
		System.out.println(f);
		
		long l = intWrapper.longValue();
		
		i = intWrapper.intValue();
	}

}
