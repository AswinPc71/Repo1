/*Create:
Shape
 ├── Circle
 ├── Rectangle
 └── Square
Each class overrides:
calculateArea()
Use:
Shape shape;
and assign different objects to it.
Example:
shape = new Circle();
shape.calculateArea();

shape = new Rectangle();
shape.calculateArea();

shape = new Square();
shape.calculateArea();*/



package practice2;

public class Demo85 {

	public static void main(String[] args) {
		Shape shape;
		shape = new Circle(5);
		System.out.println("Area of circle : " + shape.calculateArea());
		shape = new Square(7);
		System.out.println("Area of square : " + shape.calculateArea());
		shape = new Rectangle(12,5);
		System.out.println("Area of rectangle : " + shape.calculateArea());

	}

}
