package basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {
	public static void main(String[] args) {
		int[] num= {111,10,20,30,40,50,77,222};
		int i;
		System.out.println("********Array Contents*********");
		for(i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		System.out.println("Thesize of array is: "+num.length);
		System.out.println("First element array is: "+num[0]);
		System.out.println("Last Element array is"+num[num.length-1]);
		// Enter values to Array at Run Time
        System.out.println("*******************************************");
       
        int n,j;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 2nd Array Size : ");
        n=s.nextInt();
        int num1[]=new int[n];
        
        System.out.println("Enter array elements");
        for(j=0;j<n;j++)
        {
        	num1[j]=s.nextInt();
        }
        System.out.println("********** 2nd Array Contents **********");
        for(j=0;j<num1.length;j++)
        {
            System.out.print(num1[j]+ " ");
        }
        System.out.println();
        System.out.println("Display Array contents Without Loop :");
        System.out.println(Arrays.toString(num1));
	}

}
