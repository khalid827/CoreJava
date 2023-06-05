package practise1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo1 {
	
	public static void main(String[] args) {
		
		LinkedList<String> names=new LinkedList<String>();
		
		names.add("Khalid");
		names.add("Wajid");
		names.add("Adiba");
		names.add("Shahid");
		
		System.out.println(names);
		
		Collections.sort(names);
		
		System.out.println(names);
		
		names.add(2,"Noor Jahan");
		
		System.out.println(names);
		
		String first=names.getFirst();
		
		System.out.println(first);
		
		String uk=names.get(3);
		
		System.out.println(uk);
		
		names.addFirst("Add_First");
		
		System.out.println(names);
		
		names.addLast("Add_Last");
		
		System.out.println(names);
		
		System.out.println(names.contains("Wajid"));
		
		System.out.println("********Printing Using Iterator************");
		
		ListIterator<String> itr=names.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("********Printing Using for************");
		for(String e:names)
		{
			System.out.println(e);
		}

	}

}
