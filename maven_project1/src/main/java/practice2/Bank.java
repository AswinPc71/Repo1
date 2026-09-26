package practice2;

public class Bank {
	private long accountNumber;
	private String holderName;
	private double balance;
	
	Bank(long accountNumber,String holderName,double balance){
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
		}
		else {
			System.out.println("Deposit amount should be more than zero");
		}			
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("Insufficent balance");
		}
		else {
			balance -= amount;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	

}
