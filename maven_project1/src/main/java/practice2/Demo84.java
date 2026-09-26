/*Create:
Animal a = new Dog();
Call:
a.sound();
Then:
Animal a = new Cat();
a.sound();
Observe which method executes.*/



package practice2;

public class Demo84 {

	public static void main(String[] args) {
		
		Animal2 a = new Dog2();
		a.sounds();
		a = new Cat2();
		a.sounds();
	}

}
