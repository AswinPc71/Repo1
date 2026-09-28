package practice2;

public class SavingsAccount2 extends BankAccount2{
	
	SavingsAccount2(long accountNumber,double balance){
		super(accountNumber,balance);
	}
	
	public void calculateInterest() {
		double interest = getBalance() * 0.06;
		System.out.println("savings Interest : " + interest);
	}

}
