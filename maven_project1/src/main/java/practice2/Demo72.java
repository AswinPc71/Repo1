//Create:
//BankAccount
//----------------
//private accountNumber
//private holderName
//private balance
//Create:
//deposit()
//withdraw()
//getBalance()
//Rules:
//•	Deposit cannot be negative. 
//•	Withdrawal cannot exceed balance. 
//•	Balance must not be directly accessible. 



package practice2;

public class Demo72 {

	public static void main(String[] args) {
		Bank b1 = new Bank(676868697,"Jamed",0);
		System.out.println("Current Balance : " + b1.getBalance());
		b1.deposit(5000);
		System.out.println("Current Balance : " + b1.getBalance());
		b1.withdraw(300);
		System.out.println("Current Balance : " + b1.getBalance());
		b1.withdraw(7000);
		

	}

}
