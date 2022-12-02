package java_basics.com.tf.datastructures;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//adding elements to array list
		
		list.add("Venky");
		list.add("Vivek");
		list.add("asan");
		list.add("srinivas");
		
		System.out.println(list.size());  //returns no of elements
		
		for (String string : list) {
			System.out.println(string);  //for each method for reading elements in the arraylist
		}
		
	}

}
