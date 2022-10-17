class First
{
	void fun()
	{
		System.out.println("fun of First");
	}
}
class Second extends First
{
	void fun()
	{
		System.out.println("fun of Second");
	}
}
class Third
{
	void fun()
	{
		System.out.println("fun of Third");
	}
}

class TypeCastingDemo
{
	public static void main(String args[])
	{
		
		First f = new First();
		Second s = new Second();
		Third t = new Third();
		
		
		f = (First)s;		//f = s; also true; Upcasting
		f.fun();		//Second fun()

		//f = (First)t		//Error ; no inheritance betweeen first and third
		// s = f;		//error ; child ref = parent obj
		
		
		//s = (Second)f;		//typecasted, OK ; No compilation error
		//s.fun();		//RunTime Error; ClassCastException: First(Parent) CANNOT be cast to Second(Child)
	//line no. 33 and 39 if uncommented then it willnot show runtime error bcoz 
	//try to find the logic
	
	

	}
}