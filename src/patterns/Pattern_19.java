package patterns;

import java.util.Scanner;

public class Pattern_19 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows you want to enter");
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n)
		{
			int space=i-1;
			while(space>=1)
			{
				System.out.print(" ");
				space=space-1;
			}
			int j=1;
			int temp=n-i+1;
			int temp1=i;
			while(j<=temp)
			{
				System.out.print(temp1);
				temp1=temp1+1;
				j=j+1;
			}
			System.out.println();
			i=i+1;
			
		}
	}

}
