//Create a Student class with:
//•	name 
//•	age 
//•	marks 
//Create a constructor to initialize all three.
//Create an instance method to display the student's details.
//Create 3 different Student objects.



package Practice;

public class Demo1 {
	String name;
	int age;
	int mark;
	
	Demo1(String name1,int age1,int mark1){
		name = name1;
		age = age1;
		mark = mark1;
	}
	
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Marks : " + mark);
		System.out.println();
	}
	public static void main(String[] args) {
		Demo1 d1 = new Demo1("Abcd",21,78);
		d1.display();
		Demo1 d2 = new Demo1("Bcvd",23,99);
		d2.display();
		Demo1 d3 = new Demo1("Ccjk",19,87);
		d3.display();

	}

}
