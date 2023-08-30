

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListInsertTime {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		for (int i=0; i < 100; i++) {
			list.add(i);
		}
		
		int numberOfInserts = 1000000;
		
		long start = System.currentTimeMillis();
		
		for (int i=0; i < numberOfInserts; i++) {
			list.add(50,5);
		}
		long runTime = System.currentTimeMillis()-start;
		System.out.println("Time to insert "+numberOfInserts+" inserts using "+list.getClass().getName()+": "+ runTime +" milliseconds");
	}

}
