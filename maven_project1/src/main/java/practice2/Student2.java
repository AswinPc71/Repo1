package practice2;

public class Student2 extends Person2{
	int marks;
	
	Student2(String name,int age,int marks){
		super(name,age);
		this.marks = marks;
	}
	
	void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Marks : " + marks);
	}
	

}
