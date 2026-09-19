//Create a StringBuilder and append the following one by one:
//"Java"
//"is"
//"easy"
//Expected:
//Java is easy



package Practice;

public class Demo8 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println("String : " +sb);
		sb.append("Java");
		System.out.println("String after append : " +sb);
		sb.append(" is");
		System.out.println("String after append : " +sb);
		sb.append(" eaasy");
		System.out.println("String after append : " +sb);

	}

}
