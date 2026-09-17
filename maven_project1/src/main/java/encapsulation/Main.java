package encapsulation;

public class Main {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.bankAccount("Abc", 67886, 7000);
		b.display();
		b.setBalance(9000);
		System.out.println("Updated Balance : " + b.getBalance());
		
		b.display();

		b.deposit(3000);
		b.display();
		b.withdraw(1000);
		b.display();
		
		

	}

}
