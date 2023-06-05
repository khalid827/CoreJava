package oopsdemo1;

public class WiproEmployees {
	// OOP's Features - reusability
    // reuse Employee class
	public static void main(String[] args) {
		Employee w1=new Employee();
        
        w1.inputEmployeeDetails();
        w1.calculateNetSalary();
        w1.displayEmployeeDetails();
	}

}
