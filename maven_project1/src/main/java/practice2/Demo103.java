/*Create:
void calculate(final int value)
Try to modify value inside the method.
Explain the result.
Final Variable cannot be changed*/



package practice2;

public class Demo103 {

	void calculate(final int value) {
		value = value + 20;
		System.out.println(value);
	}

	public static void main(String[] args) {
		Demo103 cl = new Demo103();
		cl.calculate(12);
		

	}

}
