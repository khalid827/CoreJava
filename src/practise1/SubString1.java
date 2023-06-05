package practise1;

import java.util.Scanner;

public class SubString1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Main String  ");
		
		String str=sc.next();
		
		System.out.println("Enter the 1 st SubString : ");
		String sub1=sc.next();
		
		System.out.println("Enter the 2 nd SubString : ");
		String sub2=sc.next();
		
		System.out.println("Enter the 3 rd SubString : ");
		String sub3=sc.next();
		
		//String temp="";
		
		if(str.contains(sub1))
		{
			str=str.replaceFirst(sub1,"");
		}
		
		System.out.println(str);
		
		if(str.contains(sub2))
		{
			str=str.replaceFirst(sub2,"");
		}
		
		System.out.println(str);
		
		if(str.contains(sub3))
		{
			str=str.replaceFirst(sub3,"");
		}
		
		System.out.println(str);
		
		System.out.println(str.length());
	}

}
