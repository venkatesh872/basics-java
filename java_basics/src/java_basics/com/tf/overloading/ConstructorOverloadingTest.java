package java_basics.com.tf.overloading;

public class ConstructorOverloadingTest {

	public static void main(String[] args) {
		//ConstructorOverloading co = new ConstructorOverloading();//call first constructor
		//ConstructorOverloading co = new ConstructorOverloading(23,45);//call second constructor
		//ConstructorOverloading co = new ConstructorOverloading(12,78.90);//call third constructor
		//ConstructorOverloading co = new ConstructorOverloading(12,34,56.78);//call fourth constructor
		ConstructorOverloading co = new ConstructorOverloading(12,34.89,56);//call fourth constructor

		co.display();
	}

}
