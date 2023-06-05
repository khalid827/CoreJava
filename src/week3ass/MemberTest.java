package week3ass;

public class MemberTest {
	
	public static void main(String[] args) {
		
		Manager mn=new Manager("khalid",22,944225588,"kurnool",30000.0,"cse");
		Employee em=new Employee("wajid",30,957896451,"Banglore",50000,"Autocad");
		
		mn.printSalary();
		
		em.printSalary();
	}

}
