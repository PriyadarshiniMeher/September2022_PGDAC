
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
		First f1 = new First("Obj 1"); //creating obj of first
		// reference variable
	}
}
 class GarbageCollectionDemo2
 {
	public static void main(String args[])
	{
		//Demo d = new Demo();
		//d.myFun();
		Demo.myFun();
		First f2 = new First("obj 2"); //name = obj2 assigned
		f2 = null;
		
		Runtime.getRuntime().gc(); //To explicitly request for garbage collection
	}
 }