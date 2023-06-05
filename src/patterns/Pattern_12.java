package patterns;

import java.util.Scanner;

public class Pattern_12 {
	
	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of rows you want to enter");
		int rows=sc.nextInt();
		
		int i=1;
		char co='A';
		while(i<=rows)
		{
			
			int j=1;
			
			while(j<=rows)
			{
				
				System.out.print(co+" ");
				co=(char) ((co)+1);
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
	}

}
