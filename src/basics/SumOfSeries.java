package basics;

import java.util.Scanner;

public class SumOfSeries {
	public static void main(String[] args) {
		int i=1,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		n=sc.nextInt();
		sc.close();
		while(i<=n) {
			sum=sum+i;
			i=i+1;
			
		}
		System.out.println("The sum of series is: "+sum);
	}

}
