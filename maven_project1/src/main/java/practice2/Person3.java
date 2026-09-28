package practice2;

public class Person3 {
	
	private String name;
	private int age;
	
	public Person3(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void setAge(int agesetting) {
		age = agesetting;
	}
	
	public int getAge() {
		return age;
	}
	
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
	

}
