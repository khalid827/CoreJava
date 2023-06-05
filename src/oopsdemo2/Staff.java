package oopsdemo2;

public class Staff
{
	private int empId;
    private String name;
    protected float salary,hra;
    
    
	public Staff(int empId, String name, float salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
    
	void getHRA()
    {
        hra=(salary*60)/100;
        System.out.println("HRA :"+hra);
       
    }
   
    void display()
    {
        System.out.println(empId+" "+name+" "+salary);
    }
   
    void print()
    {
        System.out.println("Gross Salary of Staff :"+(salary+hra));
    }
}
    
class Manager extends Staff
{
	protected float da;
	private float gross;
	
	
	public Manager(int empId, String name, float salary)
	{
		super(empId, name, salary);
		
	}
	
	void getDA()
    {
        da=(salary*80)/100;
        System.out.println("DA is : "+da);
    }
   
    void getGross()
    {
        gross= salary+hra+da;
        System.out.println("Gross Salary of Manager is :"+gross);
    }
	
	
}

/* Staff --> Manager -->Director */

class Director extends Manager
{
	private float ta,gross;

	public Director(int empId, String name, float salary) {
		super(empId, name, salary);  //invoke manager
		
	}
	
	 void getTA()
	    {
	        ta=(salary*30)/100;
	        System.out.println("TA is :"+ta);
	    }
	   
	    void getGross()
	    {
	        gross= salary+hra+da+ta;
	        System.out.println("Gross Salary of Director is :"+gross);
	    }
	
	
}


