package week3ass;

public class Member {
	
	String name;
	int age;
	int phoneNumber;
	String address;
	double salary;
	
	
	
	public Member(String name, int age, int phoneNumber, String address, double salary) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}

	

	public void printSalary()
	{
		System.out.println("**********************");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary  : "+salary);
		System.out.println("Phone no : "+phoneNumber);
		System.out.println("Address : "+address);
		
	}

}
