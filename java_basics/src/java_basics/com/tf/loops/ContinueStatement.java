package java_basics.com.tf.loops;

public class ContinueStatement {
	public static void main(String[] args) {
		//continue statement
			for(int i=1;i<=10;i++) {
				if(i==5) {
					continue;
				}
				System.out.println(i);
			}
	}
}
