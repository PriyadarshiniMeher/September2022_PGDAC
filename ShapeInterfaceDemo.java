
interface Shape
{
	//double area = 0.0;
	void Calarea();

}
class PrintArea
{
	double area = 0.0;
	void printArea()
		{
			System.out.println(area);
		}
}
class Rectangle extends PrintArea implements Shape
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

class Circle extends PrintArea implements Shape
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
}

class Square extends PrintArea implements Shape
{
	double side;
	
	Square()
	{
		
	}
	Square(double side)
	{
		this.side = side;
		System.out.println("Square Constructor called");
	}
	void calArea()
	{
		area = side * side;
	}
		
}
class ShapeInterfaceDemo
{
	public static void main(String args[])
	{
		Shape s[] = new Shape[3];
		
		s[0] = new Rectangle(4.0,5.0);
		s[1] = new Square(8.0);
		s[2] = new Circle(5.0);
		
		for(int i =0; i<3; i++)
		{
			s[i].calArea();
			s[i].PrintArea();
		}
		
	
	}
}