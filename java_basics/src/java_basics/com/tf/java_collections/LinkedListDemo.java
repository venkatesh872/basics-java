package java_basics.com.tf.java_collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		
		list.add("prabhas");
		list.add("Venky");
		list.add(106587);
		list.add(25.789);
		list.add(null);
		list.add(false);
		list.add('p');
		
		System.out.println(list);
		System.out.println(list.size());
		list.remove(3);
		//list.remove('p');
		System.out.println("After removing ,new list: "+list);
		list.add(3, "java");
		System.out.println("after inserting elemenst: "+list);
		
		//retreiving value/object
		
		System.out.println(list.get(3));
		
		//change the elements
		list.set(4, "spirit");
		System.out.println("After changing the value" +list);
		
		System.out.println(list.contains("java"));
		System.out.println(list.isEmpty());
		
		//using for loop 
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//using for each loop
		for (Object object : list) {
			System.out.println(object);
		}
		//using iterative method
		
		Iterator it = list.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
