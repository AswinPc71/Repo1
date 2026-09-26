package practice2;

public class CurrentAccount extends BankAccount{
	
	CurrentAccount(double balance){
		super(balance);
	}
	
	double interestRate() {
		return balance * 0.03;
	}

}
