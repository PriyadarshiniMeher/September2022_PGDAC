
interface Shape {
	double area();
	double perimeter();
}


class Rectangle implements Shape {

	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public double area() {

		return length * breadth;
	}


	public double perimeter() {

		return 2 * (length + breadth);
	}
}

class Square implements Shape {
	
	private double side;
	public Square(double side) {
		this.side = side;
	}
	
	public double area() {
		return side * side;
	}
	
	public double perimeter() {
		return 4 * side;
	}
}
class Circle implements Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;

	}


	public double area() {

		return Math.PI * radius * radius;
	}

	public double perimeter() {

		return 2 * Math.PI * radius;
	}
}


public class ShapeAreaInterfaceDemo {

	public static void main(String[] args) {
		// Rectangle area and parameter
		double length = 2.0;
		double breadth = 3.0;
		Rectangle r = new Rectangle(length, breadth);

		System.out.println("Rectangle - Area: " + r.area());
		System.out.println("Rectangle - perimeter: " + r.perimeter());

		// Circle area and parameter
		double radius = 2.0;
		Circle c = new Circle(radius);
		System.out.println("Circle - Area: " + c.area());
		System.out.println("Circle - perimeter: " + c.perimeter());
		
		//Square area and perimeter
		double side = 5.0;
		Square s = new Square(side);
		System.out.println("Square - Area: " + s.area());
		System.out.println("Square - Perimeter: " + s.perimeter());
		

	}
}