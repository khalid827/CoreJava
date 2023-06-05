package basics;

//IncreasingTrianglePattern

public class IncreasingTrianglePattern {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++)           //for only four rows if you want more can give user input
		{
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
