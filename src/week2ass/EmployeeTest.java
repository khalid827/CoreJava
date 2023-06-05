package week2ass;

import java.util.Scanner;

public class EmployeeTest
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the year of joining");
		int yearOfJoining=sc.nextInt();
		System.out.println("Enter the Address");
		String address=sc.next();
		Employee emp=new Employee();
		
		emp.setName(name);
		emp.setYearOfJoining(yearOfJoining);
		emp.setAddress(address);
		
		System.out.println("Name\t Year of Joining \t Address");
		System.out.println(emp.getName()+"\t\t"+emp.getYearOfJoining()+"\t\t"+emp.getAddress());
		
	}
}
