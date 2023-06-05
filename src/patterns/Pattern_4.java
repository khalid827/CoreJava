package patterns;

import java.util.Scanner;

public class Pattern_4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number of rows you want to enter");
		int n=sc.nextInt();
		
		int count=1;
		
		int i=1;
		
		while(i<=n)
		{
			int j=1;
			while(j<=n)
			{
				System.out.print(count+" ");
				count=count+1;
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
	}
}
