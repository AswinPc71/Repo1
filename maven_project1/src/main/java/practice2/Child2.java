package practice2;

public class Child2 extends Parent2{
	int value = 200; 
	
	public void display() {
		System.out.println("Parent class value : " + super.value);
		System.out.println("Child class value : " + value);
	}

}
