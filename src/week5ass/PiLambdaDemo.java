package week5ass;

@FunctionalInterface
interface Pi
{
	public double piValue(); 
}

class PiLambdaDemo 
{
	public static void main(String[] args)
	{
		Pi obj=()->( Math.PI);
		
		System.out.printf("The value of pi is : %.2f",obj.piValue());
	}
}
