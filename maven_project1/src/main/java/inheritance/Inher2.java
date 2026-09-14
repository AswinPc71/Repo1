package inheritance;

public class Inher2 extends Inher {

	int gldloanid = 564632;
	String department = "Gold";
	
	public void display() {
		System.out.println("Gold Loan Id : " + gldloanid);
		System.out.println("Loan Id : " + loanid);
		System.out.println("Department Name : " + department);
		System.out.println("Branch Name : " + branchname);
		
	}
	public static void main(String args) {
		Inher2 gld = new Inher2();
		gld.display();

	}

}
