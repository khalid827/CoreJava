package basics;

public class IfElse {
	
	public static void main(String[] args) {
		
		String n1= "abcdefabcd";
		String n2= "ab";
		String n3= "cd";
		String n4= "e";
		
		while(true)
		{
			if(n1.contains(n2))
			{
				n1=n1.replaceFirst(n2, "");
			}
			
			else if(n1.contains(n3))
			{
				n1=n1.replaceFirst(n3, "");
			}
			else if(n1.contains(n4))
			{
				n1=n1.replaceFirst(n4, "");
			}
			else
			{
				break;
			}
		}
		System.out.println(n1.length());
	}

}
