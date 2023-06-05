package oopsdemo1;
//Program to demonstrate constructor
//Generate constructor -->Right click -->source -->generate constructor

public class Trainee {
	
	private int id;
	private String name,tech;
	private double stipend;
	
	public Trainee() {
		System.out.println("Implicit constructor");
		
		this.id=111;
		this.name="James Goslings";
		this.tech="Java";
		this.stipend=5000;
	}

	public Trainee(int id, String name, String tech, double stipend) {
		this.id = id;
		this.name = name;
		this.tech = tech;
		this.stipend = stipend;
	}
	
	void display() 
	{
		System.out.println("************Trainee Details******************");
		System.out.println(this.id+" "+this.name+" "+this.tech+" "+this.stipend);
	}
}
