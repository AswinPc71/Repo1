/*Create:
Animal
   ↓
Dog
Animal:
sound()
Dog overrides:
sound()
Expected:
Dog barks*/



package practice2;

public class Demo82 {

	public static void main(String[] args) {
		Animal1 dg = new Dog1();
		dg.sound();

	}

}
