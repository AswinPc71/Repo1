//Create:
//class Parent {
//    protected int value = 100;
//}
//Create a child class in another package.
//Access value through inheritance.
//Then try accessing it from a completely unrelated class.
//Observe the difference.




package practice2;

import practice3.Parent2;

public class Demo69 extends Parent2 {
	
		void display(){
			
		System.out.println(abc);
		
		}
		
public static void main(String[] args) {
	Demo69 h = new Demo69();
	h.display();
}

	}


