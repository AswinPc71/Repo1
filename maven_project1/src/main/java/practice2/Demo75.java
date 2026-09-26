//Create:
//Person
//---------
//private age
//Create:
//setAge(int age)
//Allow the age to be changed only if:
//0 <= age <= 120
//Otherwise print:
//Invalid age



package practice2;

public class Demo75 {

	public static void main(String[] args) {
		Person p1 = new Person(100);
		System.out.println("Age of the person is : " + p1.getAge());
		
		
		p1.setAge(90);
		System.out.println("Age of the person is : " + p1.getAge());
		

	}

}
