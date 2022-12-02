package java_basics.com.tf.overloading;

public class MethodOverloading {
	int a;
	int b;
	
	void sum() {
		a = 12;
		b= 23;
		System.out.println(a+b);
	}
	void sum(int x,int y) {
		int a = x;
		int b = y;
		System.out.println(a+b);
	}
	void sum(int x, int y ,int z) {
		System.out.println(x+y+z);
	}
	void sum(int x, double y) {
		System.out.println(x+y);
	}
}
