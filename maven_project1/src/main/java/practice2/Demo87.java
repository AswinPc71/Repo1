/*Create:
BankAccount
 ├── SavingsAccount
 └── CurrentAccount
Override:
calculateInterest()
Each account type should calculate interest differently.
Use a parent reference to call the overridden method.*/



package practice2;

public class Demo87 {
	public static void main(String[] args) {
		BankAccount s = new SavingsAccount(78003);
		System.out.println("Rate of interest in savings Account : " + s.interestRate());
		
		s = new CurrentAccount(78003);
		System.out.println("Rate of interest in current Account : " + s.interestRate());
	}

}
