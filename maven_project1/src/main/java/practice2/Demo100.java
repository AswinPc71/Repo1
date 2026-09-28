/*Create a Parent class with a final display() method. Create Child extends
Parent and try to override display(). Explain the result.
Final method can be inherited but not overridden*/


package practice2;

public class Demo100 extends Parent4{
	
	void display() {
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		
		Demo100 dm = new Demo100();
		dm.display();

	}

}
