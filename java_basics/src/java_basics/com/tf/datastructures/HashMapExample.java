package java_basics.com.tf.datastructures;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "venky");
		hm.put(200, "Vamsi");
		hm.put(300, "radheshyam");
		System.out.println(hm);
		
		System.out.println(hm.remove(200));
	}

}
