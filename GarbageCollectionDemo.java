
class First
{
	String name;;
	First()
	{
	}
	First(String name)
	{
	this.name = name;
	}
	public void finalize()
	{
		System.out.println("Finalized object for object :"+name+"\n");
		System.out.println("Byee");
		//code
	}
}

class Demo
{
	static void  myFun()
	{
		First f1 = new First("First Obj"); //creating obj of first
		//Local reference variable
	}
}
 class GarbageCollectionDemo
 {
	public static void main(String args[])
	{
		//Demo d = new Demo();
		//d.myFun();
		Demo.myFun();
		Runtime.getRuntime().gc(); //To explicitly request for garbage collection
	}
 }