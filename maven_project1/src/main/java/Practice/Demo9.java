//StringBuilder — Insert
//Given:
//"Java Programming"
//Insert "Full Stack " before "Java".
//Expected:
//Full Stack Java Programming



package Practice;

public class Demo9 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java Programming");
		System.out.println("String : " +sb);
		sb.insert(0, "Full Stack ");
		System.out.println("String : " +sb);

	}

}
