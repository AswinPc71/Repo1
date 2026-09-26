package practice2;

public class Vehicle {
	String brand;
	int speed;
	
	public void displayVehicle(String brand,int speed) {
		this.brand = brand;
		this.speed = speed;
		System.out.println("Brand : " + brand);
		System.out.println("Speed : " + speed);
	}

}
