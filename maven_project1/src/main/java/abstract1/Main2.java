package abstract1;

public class Main2 {

	public static void main(String[] args) {
		CreditCard cc = new CreditCard();
		cc.pay();
		UPIPayment upi = new UPIPayment();
		upi.pay();
		upi.print();
	}

}
