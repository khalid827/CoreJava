package week5ass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TotalElementsInListStream {

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
		li.add(2050);li.add(65);
		li.add(1000);li.add(225);
		li.add(95);li.add(258);
		li.add(56);li.add(193);
		
		System.out.println("***************List Before Sort*******************");
		System.out.println(li);
		System.out.println();
		
		System.out.println("**********************************");
		long cnt=li.stream().count();
		System.out.println("Total Elements in list are : "+cnt);
		System.out.println();
		
		Stream<Integer> str=li.stream();
		
		List<Integer> sort=str.sorted().collect(Collectors.toList());
		
		System.out.println("************Sorted List******************");
		System.out.println(sort);
		
		
		
	}
}
