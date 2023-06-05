package week2ass;

import java.util.Scanner;

public class Employee39Test {
	
	public static void main(String[] args)
	{
		
		float salary;
	    float hours;
	    
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the salary in dollars");
		salary=sc.nextFloat();
		
		System.out.println("Enter the hours of work");
		hours=sc.nextFloat();
		
		Employee39 emp=new Employee39();
		
		emp.getInfo(salary,hours);
		
		emp.AddSal();
		emp.AddWork();
		
		System.out.println("The Salary Of the Employee is "+emp.salary+"$");
		
	}
}
