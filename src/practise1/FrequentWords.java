package practise1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class FrequentWords {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number of elemnts you want to add in array");
		n=sc.nextInt();
		String arr[]=new String[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		Solution s=new Solution();
		String solution=s.mostFrequentWord(arr,n);
		System.out.println(solution);
	}
}

class Solution
{
    //Function to find most frequent word in an array of strings.
    public String mostFrequentWord(String arr[],int n)
    {
        // code here
        HashMap<String,Integer> h=new HashMap<>();
        Stack<String> s=new Stack<>();
        for(int i=0;i<n;i++){
        //	System.out.println(arr[i]);
        	//System.out.println(h);
        	//System.out.println(h.get(arr[i]));
            if(h.get(arr[i])==null){
            	System.out.println(h.get(arr[i])==null);
            	
            	//System.out.println("Inside if");
                h.put(arr[i],1);
              //  System.out.println(h);
                s.push(arr[i]);
              //  System.out.println(s);
            }
            else{
                h.put(arr[i],h.get(arr[i])+1);
            }
        }
       // System.out.println("HashMap is :"+h);
       // System.out.println("stack is :"+s);
        
        String r=s.pop();
        System.out.println(r);
        int max=h.get(r);
        System.out.println(max);
        while(!s.isEmpty()){	
            String d=s.pop();
            int c=h.get(d);
          if(c>max){
              max=c;
              r=d;
          }
        }
        return r;
    }
 
}
