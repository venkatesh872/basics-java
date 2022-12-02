package java_basics.com.tf.oops;

public class Employee {
	int empid;
	String empName;
	int salary;
    String designation;
    
	/*
	 * Employee(int id,String name,int sal,String desn){
	 *  empid = id; 
	 *  empName=name;
	 * salary = sal;
	 *  designation = desn; 
	 * }
	 */
    
    void setdata(int id,String name,int sal,String desn) {
    	empid = id;
    	empName=name;
    	salary = sal;
    	designation = desn;
    }
    
    void display() {
    	System.out.println(empid);
    	System.out.println(empName);
    	System.out.println(salary);
    	System.out.println(designation);
    }
}
