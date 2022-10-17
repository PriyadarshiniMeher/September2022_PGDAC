class First
{
	private int a;
	First()
	{
		
	}
	First()
	{
		
	}
	
}
Second extends First
{
	 int b;
	 
}

class Third extends Second
{
	 int c;
	c()
	{
	}

	C(int a, int b, int c)
	{
		setA(a);
		this.b = b;
		this. c = c;
	}

	public void fun()
	{
		System.out.println( getA() );
		System.out.println(b);
		System.out.println(c);
	}
}







class InitializePrivateMemberDemo
{
	public static void main(String args[])
	{
		Third tobj = new Third(
		tobj . fun();
		
		//First fobj = new First();
		//System. out. println(fobj .getA());
		
		
		//fobj.a =50; //a is private , not accesible, so use setA() method
		fobj.setA(50);
	
	}
}





class A
{
	private int a;
	A()
	{
		System.out.println("0 arg of A");
	}
	A(int a)
	{
		this.a=a;
		System.out.println("1 arg of A");		
	}
	void setA(int a)
	{
		this.a=a;
	}
	int getA()
	{
		return this.a;
	}
}
class B extends A
{
	int b;
	B()
	{
		System.out.println("0 arg of B");
	}
	
	/*B(int a, int b)		//secondary method (1)
	{
			
		super(a);
		this.b=b;
		
	}*/
	
}

class C extends B
{
	int c;
	
	C()
	{
		System.out.println("0 arg of C");
	}
	C(int a, int b, int c)
	{
	//super(a,b);			//secondary method (2)
	
	setA(a);
	this.b=b;
	this.c=c;
	System.out.println("3 arg of C");
	}
	public void fun()
	{
		System.out.println(getA());
		System.out.println(b);
		System.out.println(c);
	}
}
class InitializePrivateMember
{
	public static void main(String args[])
	{
		C cobj = new C(5,10,15);
		cobj.fun();
		
	}
}
