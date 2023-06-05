package basics;

//program to find sum of natural numbers from 1 to 100
public class ForDemo1 {
	public static void main(String[] args) {
		int sum=0,n=100;
		for(int i=1;i<=n;i++) {
				sum+=i;
				System.out.println(sum);
		}
		System.out.println("The sum is : "+sum);
	}

}
