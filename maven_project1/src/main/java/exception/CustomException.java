package exception;

public class CustomException {
	public void checkAge(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Ineligible to vote");
		}
		System.out.println("Eligible to vote");
	}
	
	public static void main(String[] args) {
		CustomException ce = new CustomException();
		
		try {
			ce.checkAge(17);
		}
		catch(InvalidAgeException iae) {
			iae.printStackTrace();
		}
		System.out.println(".........");
	}

}
