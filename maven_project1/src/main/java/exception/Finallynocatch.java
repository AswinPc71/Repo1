package exception;

public class Finallynocatch {

	public static void main(String[] args) {
				try {
					int result = 10/0;
					System.out.println(result);
				}
				finally {
					System.out.println("finally executed");
				}
				System.out.println("After Exception");

	}

}
