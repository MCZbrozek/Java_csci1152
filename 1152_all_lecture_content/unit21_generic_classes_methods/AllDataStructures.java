
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AllDataStructures {
	public static void main(String[] args) {
		
		/*
		Compare and contrast of ArrayList and Linkedlist:
		https://www.w3schools.com/java/java_linkedlist.asp
		*/
		ArrayList<Integer> array = new ArrayList<>();
		array.add(25);
		Integer arrayValue = array.get(0);
		System.out.println(arrayValue);
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(25);
		Integer linkedValue = linkedList.get(0);
		System.out.println(linkedValue);


		
		Stack<Integer> stack = new Stack<>();//LIFO
		stack.push(25);
		stack.push(26);
		Integer stackValue = stack.pop(); //returns 26
		stackValue = stack.pop(); //returns 25
		
		/* Java Queue
		https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html
		A collection designed for holding elements prior to processing. Besides basic Collection operations, queues provide additional insertion, extraction, and inspection operations. Each of these methods exists in two forms: one throws an exception if the operation fails, the other returns a special value (either null or false, depending on the operation).
		
		Queues typically, but do not necessarily, order elements in a FIFO (first-in-first-out) manner.
		*/
		Queue<Integer> queue = new ArrayDeque<>();//FIFO
		queue.add(25);
		queue.add(26);
		Integer queueValue = queue.remove();//returns 25
		queueValue = queue.remove();//returns 26
		
		
		
		System.out.println();
		
		
		//https://www.w3schools.com/java/java_hashset.asp
		HashSet<Integer> set = new HashSet<>();
		set.add(100);
		set.add(100);
		set.add(5);
		set.add(5);
		set.add(5);
		
		Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()){
			System.out.println(iter.next());
		}

		/*System.out.println();
		Integer hashValue = iter.next();//returns ?
		System.out.println(hashValue);
		hashValue = iter.next();//returns ?
		System.out.println(hashValue);
		*/
		
		System.out.println();
		
		//https://www.geeksforgeeks.org/hashtable-in-java/
		//Stores key/value pairs like a dictionary.
		//Uses hashing for fast access.
		Hashtable<String, Integer> table = new Hashtable<>();
		table.put("Mark", 21);//the key "Mark" is hashed to an integer to be used to store 21
		table.put("Lisa", 33);
		System.out.println(table);
	}

}
