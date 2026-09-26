//Create:
//Student
//---------
//private name
//private age
//private marks
//Create:
//•	getters 
//•	setters 
//•	constructor 
//•	displayDetails() 
//Prevent invalid marks such as:
//marks < 0
//marks > 100



package practice2;

public class Demo71 {

	public static void main(String[] args) {
		Student s =  new Student("James",22,80);
		s.display();
		s.setMarks(101);
		s.display();
		s.setMarks(77);
		System.out.println("After setting new marks : " + s.getMarks());
		s.display();

	}

}
