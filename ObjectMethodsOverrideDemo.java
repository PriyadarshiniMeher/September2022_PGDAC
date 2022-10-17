class Demo
{
	int a;
	int b;
	Demo()
	{
		
	}
	
	Demo(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	void fun()
	{
		System.out.println("Fun1 of Demo");
	}
	
	public String toString()		//override toString() method
	{
		String str = "Demo[a = "+a+", b = "+b+"]";
		return str;
	}
	
	public boolean equals(Demo d)		//overload equals method(because we are changing the type/parameter of method)
	//public boolean equals(Object obj) //Overriding(Check)
	{
		if(this.a == d.a && this.b == d.b)
		//if(this.a == ((Demo)obj).a && this.b == ((Demo)obj).b) //typecasting obj of Object class to obj of Demo class
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//
	public int hashCode()		//override hashCode method
	{
		return 31*(a+b); 		//code is for example purpose only..normally in IDE : we can override hashCode(Prime numbers)class rightclick source generate hashCode method
	}
	
}
class ObjectMethodsOverrideDemo
{
	public static void main(String args[])
	{
		Demo d1 = new Demo(5, 10);
		System.out.println(d1);		//System.out.println(d1.toString());
	
		Demo d2 = new Demo(5,10);
		d1.equals(d2);
		System.out.println("d1.equals(d2) : "+d1.equals(d2));
		
		System.out.println(d1.hashCode());
		System.out.println(d1.hashCode());
	
	}
}