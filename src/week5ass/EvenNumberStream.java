package week5ass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNumberStream {
	
	public static void main(String[] args) {
		
		List<Integer> li=new ArrayList<Integer>();
		
		li.add(50);
		li.add(19);
		li.add(4);
		li.add(12);
		li.add(20);
		li.add(95);
		li.add(84);
		li.add(56);
		li.add(93);
		
		System.out.println("********printing list using normal sysout********");
		System.out.println(li);
		
		Stream<Integer> str=li.stream();
		
		System.out.println("************* ArrayList Contents using for each loop**************");
        str.forEach(System.out::println);
        
        List<Integer> even=li.stream().filter(i->i%2==0).collect(Collectors.toList());
        
        System.out.println("********Printing Even Numbers Using Normal sysout********");
        System.out.println(even);
        
        System.out.println("************* ArrayList Contents of Even Numbers Using For Each loop**************");
        even.forEach(System.out::println);
        
        
        System.out.println("*************************");
        li.stream().filter(i->i%2==0).forEach(System.out::println);
	}

}
