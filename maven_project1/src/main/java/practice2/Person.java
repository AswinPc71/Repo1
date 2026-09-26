package practice2;

public class Person {
	private int age;
	
	Person(int age){
		setAge(age);
	}
	
	public void setAge(int age) {
		if(age<0 || age>120) {
			System.out.println("Invalid age");
		}
		else {
			this.age = age;
		}
	}
	
	public int getAge() {
		return age;
	}

}
