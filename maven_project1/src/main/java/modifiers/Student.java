package modifiers;

public class Student {
	private int age = 22;
	
	void showAge() {
		System.out.println("Age is : " + age);
	}

	
	public static void main(String[] args) {
		Student s = new Student();
		s.showAge();
		
	}

}
