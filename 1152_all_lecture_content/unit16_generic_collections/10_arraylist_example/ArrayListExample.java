import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample
{
	public static void main(String[] args)
	{
		//Generic Collection
		ArrayList<Double> list = new ArrayList<>();
		ArrayList<String> strList = new ArrayList<>();
		
		list.add(12.0);
		list.add(2.0);
		list.add(1.243);
		list.add(7.3);
		list.add(82.6);
		list.add(12.6);

		strList.add("hello");
		strList.add("how");
		strList.add("are");
		strList.add("you");
		strList.add(1, "goodbye");
		strList.remove(2);
		
		
		double dVar = 24.5;
		list.add(dVar);
		
		list.remove(0);
		list.add(2, 55.0);
		
		for (Double d : list) {
			System.out.println("d = "+d);
		}

		Collections.sort(list);

		System.out.println();
		for (int i =0; i < list.size(); i++) {
			System.out.println("d = "+list.get(i));
		}
		
		
		System.out.println();
		for (int i =0; i < strList.size(); i++) {
			System.out.println("d = "+strList.get(i));
		}




		//Generic
		ArrayList<Object> things = new ArrayList<>();
		
		things.add(12.0);
		things.add(2.0);
		things.add(243);
		things.add("hello");
		things.add("how");
		things.add(true);

		System.out.println();
		for (int i =0; i < things.size(); i++) {
			System.out.println(">>>"+things.get(i));
		}

	}

}
