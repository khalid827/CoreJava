package oopsdemo2;

public class CandidateTest {
	
	public static void main(String[] args) {
		
		
		JavaCandidate jc1=new JavaCandidate(1111,"Gavin king",5000,"Hibernate");
		jc1.display();
		jc1.getPerks();
		
		AccountsCandidate ac1=new AccountsCandidate(2222,"Mike john",3000);
		ac1.display();
		ac1.getPerks();
	}

}
