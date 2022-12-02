package java_basics.com.tf.arrays;

public class ArrayExample2 {

	public static void main(String[] args) {
        String a[] = new String[3];
        
        a[0] = "welcome";
        a[1] = "to";
        a[2] = "training";
        
        System.out.println(a.length); //3
        //for ... each loop
        for (String string : a) {
			System.out.println(string);
		}
	}

}
