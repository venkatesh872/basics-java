package java_basics.com.tf.interfaces;


final class Test{
	final int a = 10;
	
	final void m1() {
		//a=20; // not valid because a is final variable
		System.out.println(a);
	}
}

//class Test123 extends Test{ // not valid bcoz class is final
	/*
	 * void m1() { //not valid because a is final method
	 * System.out.println("m1 is overriden"); }
	 */
//}

public class FinalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
