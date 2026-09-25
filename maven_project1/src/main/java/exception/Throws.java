package exception;

public class Throws {

		
		public void checkAge(int age) throws ArithmeticException{
			if(age<18) {
				throw new ArithmeticException("Not eligible to vote");
			}
				System.out.println("Eligible to vote");
			
		}

		public static void main(String[] args) {
			
			Throw th = new Throw();
			
			try {
				th.checkAge(17);
			}
			catch(ArithmeticException ae){
				ae.printStackTrace();
			}
			System.out.println("Rest of the code");

		}

	}



