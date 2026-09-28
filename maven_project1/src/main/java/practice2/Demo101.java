/*Create a final class Vehicle with a run() method. Try to create class Car
extends Vehicle. What happens and why?
Final class cannot be inherited */


package practice2;

public class Demo101 extends Vehicle1{
	
	void car() {
		System.out.println("Car is 4 wheeler");
	}

	public static void main(String[] args) {
		Demo101 dm = new Demo101();
		dm.run();
		dm.car();
		

	}

}
