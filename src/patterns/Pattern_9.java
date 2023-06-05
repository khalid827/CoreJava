package patterns;

import java.util.Scanner;

public class Pattern_9 {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of rows you want to enter");
		int rows=sc.nextInt();
		
		int i=1;
		
		while(i<=rows)
		{
			//int count=i;
			int j=1;
			while(j<=i)
			{
				System.out.print(i-j+1+" ");
				//System.out.print(count+" ");
				//count=count-1;
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
		
		
	}

}
