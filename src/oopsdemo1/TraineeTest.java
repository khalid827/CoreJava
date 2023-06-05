package oopsdemo1;

public class TraineeTest {
	
	public static void main(String[] args) {
		
		Trainee t1=new Trainee(); //invoke implict constructor
		t1.display();
		
		//invokes parameterized constructor
		Trainee t2=new Trainee(222,"Red john","spring",7000); 
		t2.display();
		
		Trainee t3=new Trainee(333,"green king","Hibernate",6000); 
		t3.display();
	}

}
