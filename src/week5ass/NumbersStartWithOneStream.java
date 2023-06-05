package week5ass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumbersStartWithOneStream {
	
	public static void main(String[] args) {
		
		List<Integer> li=new ArrayList<Integer>();
		
		li.add(50);
		li.add(19);
		li.add(4);
		li.add(12);
		li.add(20);
		li.add(155);
		li.add(84);
		li.add(126);
		li.add(93);li.add(100);
		li.add(180);li.add(65);
		li.add(1000);li.add(225);
		li.add(95);li.add(258);
		li.add(56);li.add(193);
		
		Stream<Integer> str=li.stream();
		
		System.out.println("***********Contents in list********************");
		System.out.println(li);
		
		
		System.out.println("************Numbers Starting with one and output is of String type******************");
		str.map(i->i.toString()).filter(i->i.startsWith("1")).forEach(System.out::println);
		
		
		List<Integer> one=li.stream().map(i->i.toString()).filter(i->i.startsWith("1")).map(i->Integer.parseInt(i)).collect(Collectors.toList());
		
		//or
		//List<Integer> one=li.stream().map(i->i.toString()).filter(i->i.startsWith("1")).map(Integer::parseInt).collect(Collectors.toList());
		
		System.out.println("************Numbers Starting with one and output is of Integer type******************");
		System.out.println(one);
		
		//li.stream().filter(i->i.==1).forEach(System.out::println);
		
		
	}

}
