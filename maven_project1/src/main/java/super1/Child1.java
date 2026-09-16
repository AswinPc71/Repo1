package super1;

public class Child1 extends Parent1 {
	void show() {
		System.out.println("Child Method");
	}
	void display() {
		show();
		super.show();
		
	}

}
