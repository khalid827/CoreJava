package oopsdemo2;

public class Specialist extends Doctor
{
	String speciality;

	public Specialist(int idNumber, String name, String address, String sp) {
		super(idNumber, name, address);  //invokes base class constructer
		this.speciality = sp;
	}
	
	void display() {
        super.display(); // call base class method
        System.out.println("The speciality is :" + speciality);
        }
	
}

class NonSpecialist extends Doctor
{
	public NonSpecialist(int idNumber,String name,String address) {
		super(idNumber,name,address);
	}
}
