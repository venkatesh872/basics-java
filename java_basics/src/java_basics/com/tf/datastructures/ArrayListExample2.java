package java_basics.com.tf.datastructures;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add("Venkatesh");
		al.add(153);
		al.add(true);
		al.add(106587.153);
	
		System.out.println("number of elements in arraylist are: "+al.size());
		
		 al.add(3, "training");
		 al.add(4, 106587); 
		 
		System.out.println(al.indexOf(106587));
		System.out.println("elements are in list : "+al.size());
		System.out.println("elements in array list: " +al);
		/*
		for (Object object : al) {
			System.out.println(object);
		}*/
	}

}
