package patterns;

import java.util.Scanner;

public class Pattern_13 {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of rows you want to enter");
		int rows=sc.nextInt();
		
		int i=1;
		
		while(i<=rows)
		{
			
			int j=1;
			
			while(j<=rows)
			{
				char co=(char) ('A'+i+j-2);
				System.out.print(co+" ");
				
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
	}
}
