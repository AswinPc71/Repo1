package practice2;

public class SavingsAccount extends BankAccount{
	
	SavingsAccount(double balance){
		super(balance);
	}
	
	double interestRate() {
		return balance * 0.05;
	}

}
