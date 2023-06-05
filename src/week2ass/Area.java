package week2ass;

import java.util.Scanner;

public class Area {
	
	Scanner sc=new Scanner(System.in);
	
	float length;
	float breadth;
	float area;
	
	void input()
	{
		System.out.println("Enter the length");
		length=sc.nextFloat();
		System.out.println("Enter the breadth");
		breadth=sc.nextFloat();
	}
	
	public float returnArea()
	{
		area=length*breadth;
		
		return area;
	}
	
	
}
