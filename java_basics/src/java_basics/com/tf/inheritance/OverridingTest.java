package java_basics.com.tf.inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		SBI sbiobj = new SBI();
		System.out.println(sbiobj.getRateOfinterest()); //10
		
	    ICICI iciciobj = new ICICI();
		System.out.println(iciciobj.getRateOfinterest()); //15
		
		AXIS axisobj = new AXIS();
		System.out.println(axisobj.getRateOfinterest()); //12
	}

}
