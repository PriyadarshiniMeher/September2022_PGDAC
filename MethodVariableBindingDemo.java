abstract class Shape
{ 
		double area;
		
		abstract void calArea();
		
		Shape ( )
		{
			System. out. print "Shape constructor");
		}
		void printArea()
		{
			System. out. println (area);
		}
}
class Circle extends Shape
{
	double radius;
	Circle()
	{
		
	}
	Circle(double radius)
	{
			this.radius = radius;
			System.out.println("Circle Constructor called");
	}
	void calArea()
	{
		area = 3.14 * radius * radius;
	}
	void printArea()
	{
	System. out. print In (area);
	}
}

class Rectangle extends Shape
{
		double len;
		double br;
		
		Rectangle ( )
		{
			
		}
		Rectangle ( double len, double br)
		{
			this.len = len;
			this.br = br;
			System.out.println("Rectangle Constructor called");
		}
		void calArea()
		{
			area = len * br;
		}
}
class Square extends Shape
{
	double side;
	
	Square()
	{
		
	}
	Square(double side)
	{
		this.side = side;
	}
	void calArea()
	{
		area = side * side;
	}
		
}
public class ShapeAreaPolymorphismDemo
{
	public static void main(String args[])
	{
		Shape s[]; //a reference variable is formed and null is there
		s = new Shape[3]; //array is formed to store 3 reference of shape-type(or its child)
		//here shape is abstract so its own object is not created, but its child object is created.
		
		
		s[0] = new Rectangle(4.0,5.0);
		s[1] = new Square(8.0);
		s[2] = new Circle(5.0);
		
		//array of shape references
		
		for(int i=0; i<s.length; i++)
		{
			s[i].calArea();   //same statement is calling different methods i.e Polymorphism
			s[i].printArea();
			
			
		}
		
		
	}
}