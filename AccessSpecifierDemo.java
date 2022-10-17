class First
{

	public int a;
	private int b;
	
	void myFun()
	{
		System.out.println(a);  //ok
		System.out.println(b);	//ok
	}
}	
public class AccessSpecifierDemo
{
	public static void main(String args[])
	{	
		First f = new First();
		System.out.println(f.a);  //ok
		//System.out.println(f.b); // cannot access private b
		f.myFun();
	}
}



