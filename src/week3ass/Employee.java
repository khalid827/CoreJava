package week3ass;

public class Employee extends Member{
	
	String specialization;
	
	public Employee(String name, int age, int phoneNumber, String address, double salary,String sp) {
		super(name, age, phoneNumber, address, salary);
		this.specialization=sp;
		
	}
	
	public void printSalary()
	{
		super.printSalary();
		System.out.println("Specialization : "+specialization);
		System.out.println("***********************************");
	}
	
}
