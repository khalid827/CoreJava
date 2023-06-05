package javacourse;

public class ArraysLikePython {
	
	int sum(int... values) //Array.. value shouls always be last in this special array type
	{
		int res=0;
		for(int value:values)
		{
			res+=value;
		}
		return res;
	}
public static void main(String[] args) 
{
	ArraysLikePython obj=new ArraysLikePython();
	
	int res1=obj.sum(5,2);
	int res2=obj.sum(10,20,50);
	int res3=obj.sum(50,40,80,100);
	
	System.out.println(res1);
	System.out.println(res2);
	System.out.println(res3);
	
}
}
