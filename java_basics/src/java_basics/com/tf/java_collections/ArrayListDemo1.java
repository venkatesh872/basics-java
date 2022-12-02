package java_basics.com.tf.java_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		//ArrayList al = new ArrayList();
		//ArrayList<String> al = new ArrayList<String>();
		//ArrayList<Integer> al = new ArrayList<Integer>();
		
		//List al = new ArrayList();
		
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add("welcome");
		al.add('V');
		al.add(153.99);
		al.add(true);
		
		System.out.println(al);
		System.out.println("number of elements in array list: "+al.size());
		System.out.println(al.remove(1));
		
		al.add(0, "java");
		al.add(1, 106587);
		System.out.println("after insertion: "+al);
		
		System.out.println(al.get(1));
		al.set(0, "python");
		System.out.println(al);
		
		//1)for loop
		System.out.println("Reading elements using for loop.........");
		
		for(int i =0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		//2)for each loop
		System.out.println("Reading elements using for each loop.........");

		for (Object e : al) {
			System.out.println(e);
		}
		//3)iterator()
		System.out.println("Reading elements using iterator method.........");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
