package practice2;

public class Student3 extends Person3{
	private int marks;
	
	public Student3(String name,int age,int marks){
		super(name,age);
		this.marks = marks;
	}
	
	public void display() {
		super.display();
		System.out.println("Marks : " + marks);
		System.out.println();
	}

}
