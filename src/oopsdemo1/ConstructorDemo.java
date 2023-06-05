package oopsdemo1;

public class ConstructorDemo {
	
	int id;
	String name;
	float salary;
	
	ConstructorDemo()   //Implicit Constructor
	{
		System.out.println("I am implicit constructor");
		id=101;
		name="Mike";
		salary=5000.00f;
	}
	//generate constructor with arguments
	//right click in a new line -->source-->generate constructor using fields
	//-->Select all -->Generate button 
	public ConstructorDemo(int id, String name, float salary) {
		System.out.println("I am a Parameterized constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void display()
	{
		System.out.println(this.id+" "+this.name+" "+this.salary);
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo cd1=new ConstructorDemo();  //invokes implicit constructer
		ConstructorDemo cd2=new ConstructorDemo(102,"John",600.00f);  //Invokes parametarized constructor
		ConstructorDemo cd3=new ConstructorDemo();
		
		cd1.display();
		cd2.display();
		cd3.display();
	}

}
