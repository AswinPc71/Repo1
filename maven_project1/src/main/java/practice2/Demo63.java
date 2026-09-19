//Given:
//"Jvaa"
//Change the third character to 'a'.
//Expected:
//Java



package practice2;

public class Demo63 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Jvaa");
		System.out.println("Original String : " + sb);
		sb.replace(1, 2, "a");
		System.out.println("Edited String : " + sb);
		sb.replace(2, 3, "v");
		System.out.println("Edited String : " + sb);
		

	}

}
