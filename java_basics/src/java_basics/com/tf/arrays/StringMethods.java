package java_basics.com.tf.arrays;

public class StringMethods {

	public static void main(String[] args) {
		String s="welcome";
		
		System.out.println(s.length());
		
		String s1="Welcome to ";
		String s2="training";
		
		System.out.println(s1.concat(s2));
		
		String s3 ="WELCOME";
		String s4 = "welcome";
		System.out.println(s3.equals(s4));//false
		System.out.println(s3.equalsIgnoreCase(s4));//true
		
		System.out.println(s3.contains("COME"));//true
		System.out.println(s.substring(3, 7));
		System.out.println(s3.replace('O', 'o'));
	}

}
