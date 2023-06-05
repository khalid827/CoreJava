package oopsdemo1;

class Employee100
{
	int empId;
    String name;
   
    public void setData(int c,String d){
        empId=c;
        name=d;
     }
    
    public void showData(){
        System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
        System.out.println();
     }
}

public class ArrayOfObjects {
	
	public static void main(String[] args) {
		
		//Create array of objects
		Employee100[] obj=new Employee100[5]; //instead of creating and writing many objects
		
		//create actual Employee Object
		for(int i=0;i<5;i++)
		{
			obj[i]=new Employee100();
		}
		
		//assign data to objects
		obj[0].setData(100,"James");
		obj[1].setData(101,"Gavin");
		obj[2].setData(102,"Rod");
		obj[3].setData(103,"Navin");
		obj[4].setData(104,"Mary");
		
		//display employee object data
		System.out.println("******Employee Details********");
		for(int i=0;i<5;i++)
		{
			obj[i].showData();
		}
		System.out.println("*******************************");
	}

}
