package oopsdemo2;

public class SingleInheritanceDemo {
	
	public static void main(String[] args) {
		
		Developer d1=new Developer(101,"James Gosling","JDBC");
		Developer d2=new Developer(105,"Rod Johnson","Single Framework");
		
		d1.display();   //child class object invokes parent class	method
		d1.display1();  //child class object invokes child class method 
		
		d2.display();
		d2.display1();
		
	}

}
