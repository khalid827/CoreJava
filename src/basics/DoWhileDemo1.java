package basics;

import java.util.Scanner;

public class DoWhileDemo1 {
	public static void main(String[] args) {
		
		int row,column;
		System.out.println("********Multiplication Table***********\n");
		row=1;
		do {
			column=1;
			do {
				int mul=row*column;
				System.out.print(mul+"\t");
				
				column=column+1;
			}while(column<=5);
			System.out.println();
			row=row+1;
		}while(row<=5);
	}
}
