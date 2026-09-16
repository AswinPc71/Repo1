//Create a BankAccount class with:
//•	account holder name 
//•	account number 
//•	balance 
//Use a constructor to initialize them.
//Create instance methods:
//•	deposit() 
//•	withdraw() 
//•	displayBalance() 



package Practice;

public class Demo3 {
	String holderName;
	int accountNumber;
	double balance;
	
	Demo3(String holderName,int accountNumber,double balance){
		this.holderName = holderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited " + amount);
		System.out.println();
	}
	
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawn " + amount + " from Account number " + accountNumber);
		}
		else {
			System.out.println("Insufficent balance");
		}
		System.out.println();
	}
	
	public void displayBalance() {
		System.out.println("Name : " + holderName);
		System.out.println("Account Number " + accountNumber);
		System.out.println("Balance " + balance);
		System.out.println();
	}

	public static void main(String[] args) {
		
		Demo3 d1 = new Demo3("Abcd",788534,30000);
		d1.deposit(40000);
		d1.withdraw(2000);
		d1.displayBalance();

	}

}
