package oopsdemo2;
/*
 * Program to implement Single Inheritance
 */

public class AccountentTest {
	public static void main(String[] args) {
		Accountant ac1=new Accountant(201,"Gaurav sharma","process salary of employees","SAP");
		Accountant ac2=new Accountant(205,"MARY JOHN","PAYMENT TO VENDORS","TALLY");
		
		ac1.display();//Base class method
		ac1.print();//Derived class method
		
		ac2.display();
		ac2.print();
		
	}

}
