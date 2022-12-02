package java_basics.com.tf.oops;

public class EmployeeTest {

	public static void main(String[] args) {
		//assigning values to class var using object - First method
		/*Employee emp1= new Employee();
		emp1.empid= 101;
		emp1.empName="Venkatesh";
		emp1.salary=67888;
		emp1.designation="java developer";
		emp1.display();*/
		
		/*
		 * Employee emp2= new Employee(); emp2.empid= 102; emp2.empName="Venky";
		 * emp2.salary=67888; emp2.designation="java developer"; emp2.display();
		 */
		
		//assigning values to class var using constructor - 2nd method
		
		/*
		 * Employee emp1 = new Employee(101, "Venkatesh", 34000, "Developer");
		 * emp1.display(); Employee emp2 = new Employee(102, "Prabhas", 24000,
		 * "Full stack Developer"); emp2.display();
		 */
		
		//assigning values to class var using method - 3rd method
		
		Employee emp1 = new Employee();
		emp1.setdata(103, "vivek", 54666," python developwr");
		emp1.display();
	}

}
