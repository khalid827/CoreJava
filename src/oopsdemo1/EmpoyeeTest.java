package oopsdemo1;

//main class to test Employee class method
public class EmpoyeeTest {
	
	public static void main(String[] args) {
		
		//create object e1,e2,e3 of Employee class
        Employee e1=new Employee(); // invoke default constructor
        Employee e2=new Employee();
        Employee e3=new Employee();
       
        //invoke Methods (Method call)
        e1.inputEmployeeDetails(); // p1.eat();
        e1.calculateNetSalary();
        e1.displayEmployeeDetails();
       
        e2.inputEmployeeDetails();
        e2.calculateNetSalary();
        e2.displayEmployeeDetails();
       
        e3.inputEmployeeDetails();
        e3.calculateNetSalary();
        e3.displayEmployeeDetails();
		
	}

}
