package java_basics.com.tf.java_collections;

import java.util.HashMap;

public class HshMapDemo {

	public static void main(String[] args) {
		//HashMap<Integer, String> m = new HashMap<Integer, String>();
		
		HashMap m = new HashMap();
		
		m.put(101, "jhon");
		m.put(102, "david");
		m.put(103, "venky");
		m.put(104, "prabhas");
		m.put(105, "jhon");
		System.out.println(m);
		System.out.println(m.get(104));
		m.remove(105);
		System.out.println(m);
		System.out.println(m.containsKey(105));
		System.out.println(m.containsValue("jhon"));
		System.out.println(m.isEmpty());
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		System.out.println(m.entrySet());
		
		for (Object i: m.keySet()) {
			System.out.println(i);
		}
		for (Object i: m.values()) {
			System.out.println(i);
		}
		for (Object i: m.keySet()) {
			System.out.println(i+"     "+m.get(i));
		}
	}

}
