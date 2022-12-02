package java_basics.com.tf.java_collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add("v");
		al.add("e");
		al.add("n");
		al.add("k");
		al.add("a");
		al.add("t");
		
		ArrayList al_dup = new ArrayList();
		
		al_dup.addAll(al);
		System.out.println(al_dup);
		
		al_dup.removeAll(al);
		System.out.println(al_dup);
		Collections.sort(al);
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
	}

}
