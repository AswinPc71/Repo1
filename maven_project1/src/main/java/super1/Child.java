package super1;

public class Child extends Parent {
	int num = 50;
	
	void display() {
		System.out.println(num);
		System.out.println(super.num);
	}
}


