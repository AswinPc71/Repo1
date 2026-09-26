package practice2;

public class Square extends Shape{
	double side;
	
	Square(double side){
		this.side = side;
	}
	
	double calculateArea() {
		return side * side;
	}

}
