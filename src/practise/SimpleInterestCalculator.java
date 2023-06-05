package practise;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	BigDecimal principle;
	BigDecimal interest;
	
	public SimpleInterestCalculator(String principle, String interest) {
		this.interest=new BigDecimal(interest);
		this.principle=new BigDecimal(principle);
	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		//TotalValue=priciple+principle*years*noOfYears
		BigDecimal totalValue =principle.add(principle.multiply(interest).multiply(new BigDecimal(noOfYears)));
		
		return totalValue;
	}
	
	

}
