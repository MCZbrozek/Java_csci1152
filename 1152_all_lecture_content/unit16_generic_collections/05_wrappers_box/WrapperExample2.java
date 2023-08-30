public class WrapperExample2
{
	public static void main(String[] args)
	{
		//Autoboxing - primitive type is auto converted to object
		Integer iObject = 10;
		Float fObject = 56.0f;
		Long lObject = 45678l;
		Boolean bObject = true;
		
		//Auto-unboxing - object is auto converted to primitive type
		int iPrim = iObject;
		float fPrim = fObject;
		long lPrim = lObject;
		boolean bPrim = bObject;
	}
}
