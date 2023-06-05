package practise1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<String> names=new TreeSet<String>();
		
		names.add("Zubair");
		names.add("Imran");
		names.add("Omer");
		names.add("Fayaz");
		names.add("Arshad");
		names.add("Parvez");
		names.add("Akif");
		names.add("Khalid");
		
		//printed in normal order
		System.out.println(names);
		
		  TreeSet<Integer> tset3 = new TreeSet<Integer>(Comparator.reverseOrder());
	        
	        tset3.add(88);
	        tset3.add(7);
	        tset3.add(101);
	        tset3.add(0);
	        tset3.add(3);
	        tset3.add(222);
	        
	        System.out.println("Tree set in Reverse Order:"+tset3);
	        
	        Iterator itr=names.iterator();
	        
	        while(itr.hasNext())
	        {
	        	System.out.println(itr.next());
	        }
		
	}

}
