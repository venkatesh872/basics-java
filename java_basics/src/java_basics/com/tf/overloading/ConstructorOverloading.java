package java_basics.com.tf.overloading;

public class ConstructorOverloading {
	int a = 0;
	int b = 0;
	double c = 0;
	
	ConstructorOverloading(){
		a = 10;
		b = 20;
		c= 29.98;
	}
	
	ConstructorOverloading(int x,int y){
		a = x;
		b = y;
	}
	
	ConstructorOverloading(int a, double c){
		this.a = a;
		this.c = c;
	}
	ConstructorOverloading(int x,int y,double z){
		a = x;
		b = y;
		c = z;
	}
	ConstructorOverloading(int x,double y,int z){
		a = x;
		b = z;
		c = y;
	}
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
