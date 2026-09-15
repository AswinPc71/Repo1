package pack1;

import modifiers.Student2;

public class College extends Student2 {
		
		void display() {
		System.out.println("Age is : " + age);
	}
	
		public static void main(String[] args) {
			
			College c = new College();
			c.display();
}
}
