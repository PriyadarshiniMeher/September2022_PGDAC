class Demo
{
	int a;
	Demo()
	{
		
	}
	
	Demo(int a)
	{
		this.a = a;
	}
	
	void fun()
	{
		System.out.println("Fun1 of Demo");
	}
}
class ObjectMethodsDemo
{
	public static void main(String args[])
	{
		Demo d1 =  new Demo(5);
		Demo d2 =  new Demo(5);
		Demo d3;					//reference variable of null
		d3 = d1;					//d1 is assigned to d3, so reference will be same
		
		System.out.println(d1.hashCode());  //hashCode
		System.out.println(d2.hashCode());
		
		System.out.println(d1.toString());  //toString
		System.out.println(d2.toString());
		System.out.println(d1);				//also equivalent to toString method
		
		//d1.equals(d2);						//equals() method
		System.out.println(d1.equals(d2));  //false..it compares d1 and d2 reference not their content(i.e = 5)
		System.out.println(d1.equals(d3));	//true
	}
}