package oopsdemo3;

public class TestAbstraction {
	
	public static void main(String[] args) {
		
		Bike obj=new Honda();  //Upcasting
		
		obj.run();
		obj.changeGear();
	}

}
