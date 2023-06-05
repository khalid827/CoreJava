package week3ass;

public class Rectangle2 {
	
	int length;
	int breadth;
	
	public Rectangle2(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public void area()
	{
		System.out.println("Area of rectangle is :"+this.length*this.breadth);
	}
	
	public void perimeter(){
		{
			System.out.println("Perimeter of a rectangle is : "+2*(length+breadth));
		}
	}
	
}
