package java_basics.com.tf.interfaces;

public class InterfaceExample implements TestInter {
	
	@Override
	public void display() {
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TestInter obj = new InterfaceExample();
		InterfaceExample obj = new InterfaceExample();
		obj.display();
	}

	

}
