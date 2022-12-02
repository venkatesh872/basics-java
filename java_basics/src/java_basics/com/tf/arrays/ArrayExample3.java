package java_basics.com.tf.arrays;

public class ArrayExample3 {

	public static void main(String[] args) {
		//int a[] = new int[5];
		int a[] = {100,200,300,400,500}; // here there is no fixed limit
		int sum = 0;
		
		for (int i : a) {
			System.out.println(i);
			sum += i;     //100 300 600 1000 1500
		}
		System.out.println(sum);//1500
	}

}
