package java_basics.com.tf.arrays;

public class ObjectArray {

	public static void main(String[] args) {
		/*
		 * Object a[] = new Object[5];
		 * 
		 * a[0] = 10; //int
		 *  a[1] = 30.67; 
		 *  // double a[2] = "Welcome";
		 *   // string a[3] ='v';
		 *    a[4] = true;
		 */
			Object a[] ={100,435.87,"Welcome",false,'V'};
			
			for (Object object : a) {
				System.out.println(object);
			}
	}

}
