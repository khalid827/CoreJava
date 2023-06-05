package basics;

import java.util.Scanner;

//Program to count vowels in a String  - a , e, i, o, u

public class CountVowels {
	public static void main(String[] args) {
//	    String s="java is fun";
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Sentence :");
        String s1=scan.nextLine();// method takes sentence input
        String s=s1.toLowerCase();
        scan.close();
        int count=0;
        System.out.println("The Length of String is : "+s.length());
        
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
        		count+=1;
        		System.out.println("vowels found :"+s.charAt(i));
        	}
        }
        System.out.println("The total no of vowels in string: "+count);
		
	}
	
}
