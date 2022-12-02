package java_basics.com.tf.java_collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		//HashSet hs = new HashSet();//default capacity 16 load factor 0.75
		//HashSet hs = new HashSet(100); // inintial capacity 100
		
		//HashSet hs = new HashSet(100,(float)0.90);
		
		//HashSet<Integer> hs = new HashSet<Integer>();
		
		HashSet hs = new HashSet();//default capacity 16 load factor 0.75
		
		//add objects into hashset
		hs.add(100);
		hs.add("Welcome");
		hs.add("13.89");
		hs.add('a');
		hs.add(false);
		hs.add(null);
		
		System.out.println(hs);//insertion order not preserved
		
		//remove
		
		hs.remove("13.89");
		System.out.println("After removing element: "+hs);
		
		//contains
		System.out.println(hs.contains(100));
		
		System.out.println(hs.isEmpty());
		
		
		//to read we have only 2 methods for each and iteratormethod
		
		//for each loop
		
		for (Object e : hs) {
			System.out.println(e);
		}
		
		//iterator method
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
