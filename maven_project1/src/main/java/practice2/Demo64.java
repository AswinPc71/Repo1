//Create a program using StringBuffer that performs:
//•	append 
//•	insert 
//•	delete 
//•	replace 
//•	reverse 
//on a String.



package practice2;

public class Demo64 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("Original String : " + sb);
		sb.append("Hello world");
		System.out.println("Edited String : " + sb);
		sb.insert(6, "to the ");
		System.out.println("Edited String : " + sb);
		sb.delete(6, 9);
		System.out.println("Edited String : " + sb);
		sb.replace(6, 10, "to ");
		System.out.println("Edited String : " + sb);
		sb.reverse();
		System.out.println("Edited String : " + sb);

	}

}
