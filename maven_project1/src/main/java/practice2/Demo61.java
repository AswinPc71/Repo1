//Given:
//"Java123Programming"
//Remove 123 using delete().
//Expected:
//JavaProgramming



package practice2;

public class Demo61 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java123Programming");
		System.out.println("Original String : " +sb);
		sb.delete(4, 7);
		System.out.println("Edited String : " +sb);
		

	}

}
