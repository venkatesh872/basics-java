package java_basics.com.tf.interfaces;

interface A {
	int a = 23;

	void display();
}

interface B {
	int b = 56;

	void show();
}

public class MultipleInheritanceExample implements A, B {

	@Override
	public void show() {
		System.out.println(b);
	}

	@Override
	public void display() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		MultipleInheritanceExample obj = new MultipleInheritanceExample();
		obj.display();
		obj.show();
	}

}
