package patterns;

import java.util.Scanner;

public class pattern_15 {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows you want to enter");
	int n=sc.nextInt();
	int i=1;

	while(i<=n)
	{
		int space=n-i;
		
		while(space>=1)
		{
			System.out.print(" ");
			space=space-1;
		}
		int j=1;
		while(j<=i)
		{
			System.out.print("*");
			j=j+1;
		}
		System.out.println();
		i=i+1;
	}
	
	}
}
