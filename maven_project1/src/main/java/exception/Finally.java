package exception;

public class Finally {

	public static void main(String[] args) {
		try {
			int result = 10/0;
			System.out.println(result);
		}
		catch(ArithmeticException ae) {
			ae.getStackTrace();
		}
		finally {
			System.out.println("finally executed");
		}
		System.out.println("After Exception");
	}

}
