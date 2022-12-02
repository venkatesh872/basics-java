package java_basics.com.tf.static_nonstatic;

public class StaticExample {
	int a = 345;  //non static
	static int b=154; //static
	
	static void m1() {
		
		System.out.println("this is static method");
		System.out.println(StaticExample.b);
		StaticExample ve = new StaticExample();
		
		System.out.println("this is non static var: "+ ve.a);
	}
	void m2() {
		System.out.println("this is non static method");
	}
	
	void m3() {   //non static method
		a = 234; // static var
		b = 456;// non static var
		m1();// static method
		m2(); // non static method
	}
}
