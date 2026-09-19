package polymorphism;

public class Main {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.sound();
		Dog d = new Dog();
		d.sound();
		
		Animal a1 = new Cat();
		a1.sound();
				
	}

}
