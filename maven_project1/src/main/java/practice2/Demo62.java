//Given:
//"Java is difficult"
//Replace "difficult" with "easy" using StringBuilder.
//Expected:
//Java is easy



package practice2;

public class Demo62 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java is difficult");
		System.out.println("Original String : " + sb);
		sb.replace(8, 17, "easy");
		System.out.println("Edited String : " +sb);

	}

}
