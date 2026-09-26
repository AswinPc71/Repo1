/*Create:
class Person
class Student extends Person
Person has:
Person(String name, int age)
Student has:
Student(String name, int age, int marks)
Use:
super(name, age);
to initialize the parent class variables.*/



package practice2;

public class Demo79 {

	public static void main(String[] args) {
		Student2 stu = new Student2("James",23,98);
		stu.display();

	}

}
