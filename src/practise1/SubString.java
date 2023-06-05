package practise1;

import java.util.Arrays;

public class SubString
{
	boolean palindrome(String s)
	{
	    for (int i = 0; i < s.length(); i++)
	    {
	        if(s.charAt(i) != s.charAt(s.length() - i - 1))
	            return false;
	    }
	    return true;
	}
	 
	public  int evencheck(String s)
	{
		int sum=0;
		for(int i=0;i<s.length();i++)
		
		{
			String res="";
			for(int j=i;j<s.length();j++)
			{
				res+=s.charAt(j);
				if(res.length()%2==0)
				{
				if(palindrome(res))
				{
					sum=sum+1;
				}
			}
			}
		}
		return sum;
	}
	
	public int oddcheck(String s)
	{
		int sum=0;
		for(int i=0;i<s.length();i++)
		
		{
			String res="";
			for(int j=i;j<s.length();j++)
			{
				res+=s.charAt(j);
				if(res.length()%2!=0)
				{
				if(palindrome(res))
				{
					sum=sum+1;
				}
			}
			}
		}
		return sum;
	}
	
public static void main(String[] args)
{
	SubString sb=new SubString();
	String s="baa";
	int t=sb.evencheck(s);
	//System.out.println(t);
	
	int f=sb.oddcheck(s);
	//System.out.println(f);
	int arr[]= {t,f};
	
	System.out.println(Arrays.toString(arr));
}
}




