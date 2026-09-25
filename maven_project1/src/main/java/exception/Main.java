package exception;

public class Main {

	public static void main(String[] args) {
		System.out.println("Program started");
		int a = 10;
		int b = 0;
		try {
			int result = a/b;
			System.out.println(result);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println(ae.getMessage());
		}
			
		System.out.println("Rest of the program");	

	}

}
