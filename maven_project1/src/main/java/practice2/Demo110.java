package practice2;

public class Demo110 {

	public static void main(String[] args) {
		BankAccount2 sv1 = new SavingsAccount2(797868,80000);
		BankAccount2 cr1 = new SavingsAccount2(465353,45000);
		
		sv1.calculateInterest();
		cr1.calculateInterest();

	}

}
