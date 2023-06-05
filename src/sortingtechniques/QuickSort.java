package sortingtechniques;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the number of elements to enter");
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    System.out.println("Enter the array Elements");
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    
		    part pa=new part();
		   int ans[]=pa.sort(arr,0,n-1);
			System.out.println(Arrays.toString(ans));
	}

}
class part
{
    int partition(int[] a,int lb,int up)
    {
        int pivot=a[lb];
        int start=lb;
        int end=up;
        
        while(start<end)
        {
            while(a[start]<=pivot)
            {
                start++;
            }
            while(a[end]>pivot)
            {
                end--;
            }
            if(start<end)
            {
                int temp=a[start];
                a[start]=a[end];
                a[end]=temp;
            }
        }
        int temp1=a[end];
        a[end]=a[lb];
        a[lb]=temp1;
        
        return end;
        
    }
    
    int[] sort(int[] arra,int lb,int hb)
    {
        if(lb<hb)
        {
            int loc=partition(arra,lb,hb);
            sort(arra,lb,loc-1);
            sort(arra,loc+1,hb);
        }
        return arra;
    }
}
