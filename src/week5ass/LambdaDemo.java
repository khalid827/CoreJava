package week5ass;

public class LambdaDemo {
	
	public static void main(String[] args) {
		
		LambdaInterface isOdd=(n)->(n%2!=0);
		LambdaInterface isPrime=(n)->{
			if (n <= 1)
	            return false;
	  
	        // Check from 2 to n-1
	        for (int i = 2; i < n; i++)
	            if (n % i == 0)
	                return false;
	  
	        return true;
			
		};
		
		LambdaInterface isPalindrome=(n)->{
			String reverse="";
			String temp=Integer.toString(n);
			for(int i=temp.length()-1;i>=0;i--)
			{
				reverse=reverse+temp.charAt(i);
			}
			
			if(n==Integer.parseInt(reverse))
			{
				return true;
			}
		return false;	
		};
		
		System.out.println("Is number odd : "+isOdd.compute(3));
		
		System.out.println("Is number Prime : "+isPrime.compute(5));
		
		System.out.println("Is number Palindrome : "+isPalindrome.compute(351));
		
		
		

}
}
