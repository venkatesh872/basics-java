package java_basics.com.tf.java_collections;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet<Integer> evenNumber = new HashSet<Integer>();
		
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		evenNumber.add(8);
		evenNumber.add(10);
		
		System.out.println(evenNumber);
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		//addAll
		numbers.addAll(evenNumber);
		numbers.add(12);
		System.out.println("New hashset: "+numbers);
		
		
		//removeAll()
		numbers.removeAll(evenNumber);
		System.out.println("after removing:"+numbers);
	}

}
