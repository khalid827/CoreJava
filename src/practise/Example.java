package practise;


import java.util.Date;
import java.util.Scanner;
class Payment{
	public static int dueAmount;
	
	Scanner sc=new Scanner(System.in);
	public int getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(int dueAmount) {
		this.dueAmount = dueAmount;
	}
	

	public boolean payAmount() {
		System.out.println("Payment not done and your due amount is "+dueAmount);
		return false;
		
	}
}
class Cheque extends Payment{
	String chequeNo;
	int chequeAmount;
	Date dateOfIssue;
	public String getChequeNo() {
		return chequeNo;
	}
	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}
	public int getChequeAmount() {
		return chequeAmount;
	}
	public void setChequeAmount(int chequeAmount) {
		this.chequeAmount = chequeAmount;
	}
	public Date getDateOfIssue() {
		return dateOfIssue;
	}
	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	public boolean payAmount() {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the cheque number");
		chequeNo=ss.next();
		System.out.println("Enter the cheque amount");
		chequeAmount=ss.nextInt();
		System.out.println("Enter the date of issue:");
		String dateOfIssue=ss.next();
		
		if(dueAmount>chequeAmount){
			super.payAmount();
			
		}
		else {
			System.out.println("Payment done successfully via cheque");
			return true;
		}
		return true;
	}
}
class Cash extends Payment{
	int cashAmount;

	public int getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(int cashAmount) {
		this.cashAmount = cashAmount;
	}
	public boolean payAmount() {
		Scanner sc=new Scanner(System.in);
		
		
			System.out.println("Enter the cash amount");
			int cashAmount=sc.nextInt();
			if(dueAmount>cashAmount){
				super.payAmount();
				
			}
			else {
				System.out.println("Payment done successfully");
				return true;
			}
		
	  return true;
	}
}
class Credit extends Payment{
	int creditCardNo;
	String cardType;
	int creditCardAmount;
	public int getCreditCardNo() {
		return creditCardNo;
	}
	public void setCreditCardNo(int creditCardNo) {
		this.creditCardNo = creditCardNo;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public int getCreditCardAmount() {
		return creditCardAmount;
	}
	public void setCreditCardAmount(int creditCardAmount) {
		this.creditCardAmount = creditCardAmount;
	}
	public boolean payAmount() {
		
		Scanner ps=new Scanner(System.in);
		int res=0;
		System.out.println("Enter the credit card number");
		creditCardNo=ps.nextInt();
		System.out.println("Enter the cardType(silver,gold,platinum):");
		cardType=ps.next();
		if(cardType.equals("silver")) {
			creditCardAmount=10000;
			res=(int)(2*dueAmount/100);
			
		}
		else if(cardType.equals("gold"))
		{
			creditCardAmount=50000;
			res=(int)5/100*(dueAmount);
		}
		else if(cardType.equals("platinum"))
		{
			creditCardAmount=100000;
			res=(int)10/100*(dueAmount);
		}
		
		if(dueAmount>creditCardAmount){
			super.payAmount();
		}
		else {
			creditCardAmount=creditCardAmount-dueAmount-res;
			System.out.println("Payment done successfully via credit card.Remaining amount in your "+cardType+"card is "+creditCardAmount );
			return true;
		
	}
	return true;
}
}

public class Example {

	public static void main(String[] args) {
		
		int dueAmount;
		Scanner cc=new Scanner(System.in);
		Payment p=new Payment();
		
		System.out.println("Enter the due amount:");
		
		dueAmount=cc.nextInt();
		//p.accept();
		p.setDueAmount(dueAmount);
		
		System.out.println("Enter the mode of payment(cheque/cash/credit):");
		String mode=cc.next();
		if(mode.equals("cash")) {
			Cash c=new Cash();
			c.payAmount();
		}
		else if(mode.equals("cheque")) {
			Cheque ch=new Cheque();
			ch.payAmount();
		}
		else if(mode.equals("credit")) {
			Credit cr=new Credit();
			cr.payAmount();
		}
	}
}
