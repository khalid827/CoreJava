package practise1;

import java.util.Arrays;

public class TelephoneBill {
	
	public static void main(String[] args) {
		
		int arr[]= {100,100,100};
		int amount=1200;
		
		int local=(int) (arr[0]*0.25);
		
		int std=arr[1]*1;
		
		int isd=arr[2]*10;
		
		int total=local+std+isd;
		
		System.out.println(total);
		
		int check;
		
		if(total<=amount)
		{
			check=0;
			//total=total;
		}
		else
		{
			check=1;
			total=total-amount;
		}
		
		int res[]= {check,total};
		
		System.out.println(Arrays.toString(res));
	}

}
