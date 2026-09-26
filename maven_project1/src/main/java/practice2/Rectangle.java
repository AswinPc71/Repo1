package practice2;

public class Rectangle extends Shape{
	double width;
	double height;
	
	Rectangle(double width,double height){
		this.height = height;
		this.width = width;
	}
	
	double calculateArea() {
		return  height * width;
	}

}
