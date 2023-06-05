package patterns;

import java.util.Scanner;

public class Pattern_22 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows you want to enter");
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n)
		{
			//First part
			int j=1;
			int temp=n-i+1;
			
			while(j<=temp)
			{
				System.out.print(j);
				j=j+1;
			}
			
			//Second Part
			int k=(2*i)-2;
			while(k>=1)
			{
				System.out.print("*");
				k=k-1;
			}
			int last=n-i+1;
			while(last>=1)
			{
				System.out.print(last);
				last=last-1;
			}
				System.out.println();
				i=i+1;
		}
	}

}
