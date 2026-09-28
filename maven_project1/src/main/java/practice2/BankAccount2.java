package practice2;

abstract class BankAccount2 {
	private long accountNumber;
	private double balance;
	
	BankAccount2(long accountnumber,double balance){
		this.accountNumber = accountnumber;
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		if(amount<=0) {
			System.out.println("Deposit Amount should be greater than zero");
		}
		else {
			balance += amount;
		}
	}
	
	public void withdraw(int amount) {
		if(amount>balance) {
			System.out.println("Insufficent balance");
		}
		else {
			balance -= amount; 
		}
	}
	
	double getBalance() {
		return balance;
	}
	abstract void calculateInterest();
	
	

}
