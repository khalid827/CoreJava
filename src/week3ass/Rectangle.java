package week3ass;

public class Rectangle {
	
	float length;
	float breadth;
	float area;
	float perimeter;
	
	public Rectangle(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public void area()
	{
		area=length*breadth;
		System.out.println("The area and perimeter of square is :"+area);
	}
}
