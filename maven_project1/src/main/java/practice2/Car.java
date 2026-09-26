package practice2;

public class Car extends Vehicle{
	int numberOfDoors;
	
	public void displayCar(int numberOfDoors){
		this.numberOfDoors = numberOfDoors;
		System.out.println("Number of Doors : " + numberOfDoors);
	}

}
