public class Part305MethodErrors
{
	public static void main(String[] args)
	{
		/* TODO: Uncomment the next two lines of
		code and recompile to see what error
		occurs when there is a typo in the method
		name. Answer in a comment. */
		//double v = getSfereVolume(7.85);
		//System.out.println("\nSphere volume: " + v);


		/* DO NOT name variables the same as
		methods. Unbelievably Java will let you
		get away with this, but it shouldn't.
		This is why I think all methods should
		be verbs or verb phrases and all
		variables should be nouns or noun
		phrases. */
		double sphereVolume = 628;
		System.out.println("\nSphere volume: " + sphereVolume);
		
		sphereVolume = sphereVolume(3.8);
		System.out.println("\nSphere volume: " + sphereVolume);
		
	} // end main
	
	public static double sphereVolume(double radius)
	{
		double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		return volume;
	}
	
	//This is a better method name than the above.
	//Another decent option is 'calcSphereVolume'
	public static double getSphereVolume(double radius)
	{
		double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		return volume;
	}
	
} // end class
