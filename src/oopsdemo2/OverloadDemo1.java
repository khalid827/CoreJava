package oopsdemo2;

class Trainee
{
	void skills(int id,String name)
	{
		System.out.println(id+" "+name);
	}
	
	void skills()
	{
		System.out.println("Trainee Skills Management System");
	}
	
	void skills(int id,String name,String prgm)
	{
		System.out.println(id+" "+name+" "+prgm);
	}
	
	void skills(int id,String name,String prgm,String db)
	{
		System.out.println(id+" "+name+" "+prgm+" "+db);
	}
}

public class OverloadDemo1 {
	
	public static void main(String[] args) {
		
		Trainee t1=new Trainee();
		
		t1.skills();
		
		System.out.println("Traine  without skills : ");
		t1.skills(101, "Mike");
		
		System.out.println("Traine  with programming skills : ");
		t1.skills(101, "James","Java");
		
		System.out.println("Traine  with programming and Database skills : ");
		t1.skills(101, "Mary","Java","MySql");
	}

}
