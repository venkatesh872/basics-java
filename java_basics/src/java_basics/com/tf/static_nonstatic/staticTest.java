package java_basics.com.tf.static_nonstatic;

public class staticTest {

	public static void main(String[] args) {    //this is static method
		System.out.println(StaticExample.b);
		StaticExample.m1();
	
		StaticExample se= new StaticExample();
		se.a=123;
		System.out.println(se.a);
		se.m2();
		se.m3();// non staticc method can access both st and non st  directly..
	}

}
