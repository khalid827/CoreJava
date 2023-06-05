package basics;

import java.util.Scanner;

//RightTrianglePattern

public class RightTrianglePattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,rows,space;
		System.out.println("Enter no of rows");
		rows=sc.nextInt();
		for(i=1;i<=rows;i++)
		{
			for(space=rows;space>i;space--) 
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
