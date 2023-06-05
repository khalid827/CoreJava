package practise1;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		
		al.add("Hi");
		al.add("Never");
		al.add("Are");
		al.add("You");
		al.add("Give");
		al.add("Up");
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);
		
		Collections.reverse(al);
		
		System.out.println(al);
	}

}
