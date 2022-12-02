package java_basics.com.tf.arrays;

public class TwodimentionalArray {

	public static void main(String[] args) {
		int a[][] = new int[3][2];//declaration
		//storing values into array
		
		a[0][0] = 10;
		a[0][1] = 20;
		
		a[1][0] = 30;
		a[1][1] = 40;
		
		a[2][0] = 50;
		a[2][1] = 60;
		
		for(int i=0;i<=2;i++) {     //impl the rows
			for(int j=0;j<=1;j++) { 
				System.out.println(a[i][j]);
			}
		}
	}

}
