package week3ass;

public class Manager extends Member {
	
	String department;
	
	public Manager(String name, int age, int phoneNumber, String address, double salary,String dept) {
		super(name, age, phoneNumber, address, salary);
		this.department=dept;
	}

	
	public void printSalary()
	{
		super.printSalary();
		System.out.println("Department : "+department);
		System.out.println("**************************");
	}
	

}



