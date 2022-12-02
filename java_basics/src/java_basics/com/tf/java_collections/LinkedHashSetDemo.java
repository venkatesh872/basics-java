package java_basics.com.tf.java_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hset = new HashSet<Integer>();
		hset.add(100);
		hset.add(200);
		hset.add(300);
		hset.add(400);
		hset.add(500);
		System.out.println(hset);
		LinkedHashSet<Integer> lset = new  LinkedHashSet<Integer>();
		lset.add(600);
		lset.add(6789);
		lset.add(300);
		lset.add(400);
		lset.add(500); 
		System.out.println(lset);
	}

}
