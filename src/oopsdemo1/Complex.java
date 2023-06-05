package oopsdemo1;

//Program to add two complex numbers -Real and imaginry
public class Complex {

	double real;
	double imaginary;
	
	//Generate constructor using fields
	public Complex(double real, double imaginary) {  //Parameterized constructor 
		this.real = real;
		this.imaginary = imaginary;
	}
	
	void add(Complex obj)   //method which accepts objects as arguments
	{
		//c1.real+=c2.real
		this.real+=obj.real;
		//c1.imaginary+=c2.realimaginary
		this.imaginary+=obj.imaginary;
	}
	
	
	
	void display()
	{
		System.out.println("r"+this.real+" +i"+this.imaginary);
	}
}
