class First{
	void fun1()
	{
		System.out.println("funl of First");
	}

	void fun2()  //overidden method
	{
			System.out.println("fun2 of First");
	}
}
class Second extends First{
	void fun2()     //overiding method
	{
		System.out.println("fun2 of Second");
	}

	void fun3()
	{
			System.out.println("fun3 of Second");
	}
}



class ParentReferenceDemo
{
	public static void main(String args[])
	{
		First f;
		f = new Second();
		f.fun1();
		f.fun2();
		//f.fun3(); //Error : fun3() is not with parent
		
		//Second s = new First();  //Error : cannot keep reference of parent obj
	}

}