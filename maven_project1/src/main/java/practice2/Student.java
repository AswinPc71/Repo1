package practice2;

public class Student {
	private String name;
	private int age;
	private int marks;
	
	Student(String name,int age,int marks){
		this.name = name;
		this.age = age;
		setMarks(marks);
	}
	
	public void setMarks(int marks) {
		if(marks<0 || marks>100) {
			System.out.println("Invalid input");
			System.out.println();
		}
		else {
		this.marks = marks;
		}
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void display() {
		System.out.println("Student Name : " + name);
		System.out.println("Student Age : " + age);
		System.out.println("Student Marks : " + marks);
		System.out.println();
	}
	

}
