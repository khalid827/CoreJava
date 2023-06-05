package practise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr=new ArrayList<String>();
		
		arr.add("Red");
		arr.add("Blue");
		arr.add("Green");
		arr.add("Brown");
		arr.add("Black");
		
		System.out.println(arr);
		
		//printing by iterator
		
		Iterator<String> itr=arr.iterator();
		
		System.out.println("**************************");
		System.out.println("Printing by iterator");
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//printing by for each loop
		System.out.println("**************************");
		System.out.println("Printing by for each loop");
		
		for(String i:arr)
		{
			System.out.println(i);
		}
		
		System.out.println("**************************");
		System.out.println("Sorting using collections");
		Collections.sort(arr);
		System.out.println(arr);
		
		arr.add(2,"Hameed");
		System.out.println(arr);
		
		
	}

}
