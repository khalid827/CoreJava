package patterns;

import java.util.Scanner;

public class Pattern_5 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of rows you want to enter");
		int rows=sc.nextInt();
		
		int i=1;
		
		while(i<=rows)
		{
			int column=1;
			
			while(column<=i)
			{
				System.out.print("* ");
				column=column+1;
			}
			System.out.println();
			i=i+1;
		}
		
	}

}
