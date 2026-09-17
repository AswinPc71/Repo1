package encapsulation;

public class Bank {
	private String accountHolder;
	private int accountNumber;
	private double balance;
	

	public void bankAccount(String accountHolder,int accountNumber,double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void setBalance(double amount) {
		balance = amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	void deposit(double amount) {
		if(amount>0) {
			balance += amount;
			System.out.println("Deposited " + amount + " in account number " + accountNumber);
		}
		else {
			System.out.println("Deposit must be greater than zero");
		}
	}
	
	void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("Insufficent balance");
		}
		else {
			balance -= amount;
			System.out.println("Withdrawn " + amount + " in account number " + accountNumber);
		}
	}
	
	void display() {
		System.out.println("Account Holder Name : " + accountHolder);
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account Balance : " + balance);
		System.out.println();
		
	}
	

}
