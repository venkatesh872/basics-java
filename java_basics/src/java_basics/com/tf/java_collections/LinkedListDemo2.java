package java_basics.com.tf.java_collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		
		LinkedList<String> new_list= new LinkedList<String>();
		new_list.addAll(l);
		System.out.println(new_list);
		
		new_list.removeAll(l);
		System.out.println(new_list);
		
		System.out.println("Before sorting"+l);
		Collections.sort(l);
		System.out.println("After sorting"+l);
	}

}
