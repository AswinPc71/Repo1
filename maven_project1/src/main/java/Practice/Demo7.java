//Create a program to reverse a String using StringBuilder.
//Example:
//Input:  Java
//Output: avaJ



package Practice;

public class Demo7 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Java");
		String og = sb.toString();
		System.out.println("Original String : " + og);
		
		sb.reverse();
		
		String rv = sb.toString();
		System.out.println("Reversed String : " + rv);
		

	}

}
