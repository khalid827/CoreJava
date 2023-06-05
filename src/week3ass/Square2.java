package week3ass;

public class Square2 extends Rectangle2{
	
	int side;
	
	public Square2(int length, int breadth,int s)
	{
		super(length, breadth);
		this.side=s;
	}
	
	public void area()
	{
		super.area();
		System.out.println("Area of Square is :"+Math.pow(side,2));
	}
	
	public void perimeter(){
		{
			super.perimeter();
			System.out.println("Perimeter of a Square is : "+2*side);
		}
	}
	
}
