package finalk;

public class Student {
	final int rollno = 78;
	String name = "abc";
	
	void display() {
		System.out.println(name);
		System.out.println(rollno);
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.display();
		//s.rollno = 45; //final value cant be changed
	}

}
