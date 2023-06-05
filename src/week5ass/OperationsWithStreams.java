package week5ass;

import java.util.ArrayList;
import java.util.List;

public class OperationsWithStreams {
	
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
		
		System.out.println("************Sum Using reduce stream**********");
		int sum=li.stream().reduce(0,(a,b)->a+b);
		System.out.println("sum : "+sum);
		
		System.out.println("****************Max value using reduce stream***********");
		int max=li.stream().reduce(0,(a,b)->a>b?a:b);
		System.out.println("max : "+max);
		
		System.out.println("****************Min Value using reduce stream**************");
		int min=li.stream().reduce((a,b)->a<b?a:b).get();
		System.out.println("min : "+min);
		
		System.out.println("**************************************************");
		int sum1=li.stream().reduce(Integer::sum).get();
		System.out.println(sum1);
		
		System.out.println("**************************************************");
		int max1=li.stream().reduce(Integer::max).get();
		System.out.println(max1);
		
		System.out.println("**************************************************");
		int min1=li.stream().reduce(Integer::min).get();
		System.out.println(min1);
		
		System.out.println("**************************************************");
		int max2=li.stream().max(Integer::compare).get();
		System.out.println(max2);
		
		System.out.println("**************************************************");
		int min2=li.stream().min(Integer::compare).get();
		System.out.println(min2);
		
		
		
		
		
		
	}

}
