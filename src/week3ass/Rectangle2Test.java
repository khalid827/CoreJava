package week3ass;

import java.util.Scanner;

public class Rectangle2Test {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length and breadth");
		int l=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Enter side of the square");
		int s=sc.nextInt();
		
		Square2 sq=new Square2(l,b,s);
		
		sq.area();
		sq.perimeter();
		
		
	}
}
