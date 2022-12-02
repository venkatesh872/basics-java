package java_basics.com.tf.arrays;

public class ArrayExample {

	public static void main(String[] args) {
		int a[] = new int[5]; //declaration of array with 5 elements
		
		 a[0] = 10; a[1] = 20; a[2] = 30; a[3] = 40; a[4] = 50;
		 
		 // System.out.println(a[3]);
		 
			/*
			 * for (int i=0;i<=4;i++) 
			 * { System.out.println(a[i]); //10 20 30 40 ... }
			 */
		  //for Each loop
		  for (int i : a) 
		  {
			System.out.println(i);
		}
	}

}

/*
 * limitatins
 * 
 * 1.there is a limit,based up on the limit we can store only those many no of
 * elements
 * 
 * 2.you can store only same datatype of elements
 * to overcome these two limitations,we have other data structures like arraylist,object class we can use it
 */