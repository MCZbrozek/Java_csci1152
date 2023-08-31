//Example code from here with modifications:
//http://tutorials.jenkov.com/java-collections/map.html
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class MapExample
{
	public static void main(String[] args)
	{
		//generic map
		Map<String, String> map = new HashMap<String, String>();
		
		//People and what street they live on
		map.put("Jean", "Paseo");
		map.put("Armando", "Candelaria");
		map.put("Raquel", "Eubank");
		
		//This causes warnings
		//Compile with the following to see the details
		//   javac MapExample.java -Xlint
		//Map mapA = new HashMap();
		//mapA.put("key", 123);
		

		String example1 = map.get("Jean");
		System.out.println(example1);
		

		String example2 = map.getOrDefault("Ronald", "default value");
		System.out.println(example2);


		boolean hasKey = map.containsKey("Armando");
		if(hasKey)
			System.out.println("Armando lives on "+map.get("Armando"));
		else
			System.out.println("Armando not found");


		String name = "Justine";
		hasKey = map.containsKey(name);
		if(hasKey)
			System.out.println(name+" lives on "+map.get(name));
		else
			System.out.println(name+" not found");
		
		
		String street_name = "Candelaria";
		if(map.containsValue(street_name))
			System.out.println("Some people who live on "+street_name+" are in the database");
		else
			System.out.println("No one who lives on "+street_name+" is in the database");


		if(map.containsValue("Griegos"))
			System.out.println("Some people who live on Griegos are in the database");
		else
			System.out.println("No one who lives on Griegos is in the database");
		
		
		System.out.println(); //line break

		
		//Using a key iterator with Object type
		Iterator iterator = map.keySet().iterator();
		while(iterator.hasNext()){
			Object key   = iterator.next();
			Object value = map.get(key);
		}
		
		
		//Better use of a key iterator
		iterator = map.keySet().iterator(); //reset the iterator
		while(iterator.hasNext()){
			String key   = (String)iterator.next();
			String value = (String)map.get(key);
			System.out.println(key+" lives on "+value);
		}

	}
}
