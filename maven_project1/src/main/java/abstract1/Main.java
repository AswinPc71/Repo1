package abstract1;

public class Main {

	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.welcome();
		sbi.rateOfInterest();
		
		System.out.println();
		
		HDFC hdfc = new HDFC();
		hdfc.welcome();
		hdfc.rateOfInterest();

	}

}
