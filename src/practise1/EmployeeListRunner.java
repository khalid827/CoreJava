package practise1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeListRunner {
	
	public static void main(String[] args) {
		
		List<EmployeeList> arr=new ArrayList<EmployeeList>();
		
		EmployeeList em1=new EmployeeList(501,"Aamir","Cse",4);
		EmployeeList em2=new EmployeeList(502,"Kalam","Cse",4);
		EmployeeList em3=new EmployeeList(503,"Khalid","Cse",4);
		EmployeeList em4=new EmployeeList(401,"Furqan","Civil",4);
		
		arr.add(em1);
		arr.add(em2);
		arr.add(em3);
		arr.add(em4);
		
		//System.out.println(arr);
		
		for(EmployeeList emp:arr)
		{
			System.out.println(emp.roolNo+" "+emp.name+" "+emp.department+" "+emp.year);
		}
		
		System.out.println(arr.isEmpty());
		
		Iterator<EmployeeList> itr=arr.iterator();
		
		
	}

}
