package basics;

import java.util.Scanner;

//DecreasingTrianglePattern

public class DecreasingTrianglePattern {
	public static void main(String[] args) {
		int row,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of rows");
		row=sc.nextInt();
		for(i=row;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
