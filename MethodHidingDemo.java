class First{
	 static void myfun()
	{
		System.out.println("myfun of First");
	}
	  void anotherfun()
	{
		System.out.println("anotherfun of First");
	}
	
}
class Second extends First{
	 static void myfun()     //method hiding
	{
		System.out.println("myfun of Second");
	}

	  void anotherfun()
	{
		System.out.println("anotherfun of Second");
	}
}



class MethodHidingDemo
{
	public static void main(String args[])
	{
		//First f;
		Second f;
		f = new Second();
		f.myfun(); //static method cannot be oerridden bcox always its binding happens at compile time
		f.anotherfun();
		
	}

}