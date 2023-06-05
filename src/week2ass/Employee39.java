 package week2ass;

public class Employee39 {
	
	float salary;
    float hours;
    
    public void getInfo(float salary,float hours)
    {
    	this.salary=salary;
    	this.hours=hours;
    }
    
    public void AddSal()
    {
    	
    	if(salary<500)
    	{
    		salary=salary+10;
    	}
    }
    
    public void AddWork()
    {
    	
    	if(hours>6)
    	{
    		salary=salary+5;
    	}
    }
}
