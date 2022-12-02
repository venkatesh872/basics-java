package java_basics.com.tf.oops;

public class Calculation {
       int a;
       int b;
       
      //method may not take parameters - empty parameters
       
       void sum() {
    	   System.out.println(a+b);
       }
       
       //method takes parameters
       void diff(int a, int b) {
    	 this.a = a;
    	 this.b = b;
    	 System.out.println(a-b);
       }
       
       //method returns some value
       
       int multiplication(){
    	   return(a*b);
       }
       
	public static void main(String[] args) {
		Calculation cal = new Calculation();
		cal.a = 100;
		cal.b = 200;
		cal.sum();
		
		Calculation cal1 = new Calculation();
		cal1.diff(34, 5);
		
		Calculation cal2 = new Calculation();
		cal2.a= 3;
		cal2.b=4;
		int result =cal.multiplication();
		System.out.println(result);
	}

}
