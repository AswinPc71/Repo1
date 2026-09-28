package practice2;

public class CurrentAccount2 extends BankAccount2{
	
	CurrentAccount2(long accountNumber,double balance){
		super(accountNumber,balance);
	}
	
	void getInterest() {
		double interest = getBalance() * 0.04;
		System.out.println("Current Account : " + interest);
	}

}
