package basics;

//Program to print Diamond pattern

public class DiamondPattern {
	public static void main(String[] args) {
		int i,j,space;
		for(i=1;i<=5;i++)
		{
			for(space=5;space>i;space--)     //To print the spaces
			{
				System.out.print(" ");
			}
			for(j=1;j<=(2*i-1);j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(i=4;i>=1;i--)
		{
			for(space=5;space>i;space--)     //To print the spaces
			{	
				System.out.print(" ");
			}
			for(j=1;j<=(2*i-1);j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
