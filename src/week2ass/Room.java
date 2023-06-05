package week2ass;

import java.util.Scanner;

public class Room {
		private int roomNo;
		private String roomType;
		private int roomArea;
		private String acMachine;
		
		Scanner sc=new Scanner(System.in);
		
		public void setData()
		{
			System.out.println("Enter the room number");
			roomNo=sc.nextInt();
			System.out.println("Enter the room type");
			roomType=sc.next();
			System.out.println("Enter the roomarea");
			roomArea=sc.nextInt();
			System.out.println("Enter the ac machine");
			acMachine=sc.next();
			
		}
		public void displayData()
		{
			System.out.println("Room no is    :"+roomNo);
			System.out.println("Room type is  :"+roomType);
			System.out.println("Room Area is  :"+roomArea);
			System.out.println("Ac machine is :"+acMachine);
		}
		
		
		
		
}
