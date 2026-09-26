/*Create:
Animal
 ├── Dog
 ├── Cat
 └── Cow
Each class overrides:
sound()
Create objects and call their respective methods.*/



package practice2;

public class Demo83 {

	public static void main(String[] args) {
		Animal2 ad = new Dog2();
		ad.sounds();
		Animal2 ac = new Cat2();
		ac.sounds();
		Animal2 aw = new Cow2();
		aw.sounds();	
	}

}
