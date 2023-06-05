package practise1;

public class EmployeeList {
	
	int roolNo;
	String name,department;
	int year;
	
	public EmployeeList(int roolNo, String name, String department, int year) {
		this.roolNo = roolNo;
		this.name = name;
		this.department = department;
		this.year = year;
	}

	public int getRoolNo() {
		return roolNo;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public int getYear() {
		return year;
	}
	
	
	

}
