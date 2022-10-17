
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
 class GarbageCollectionDemo3
 {
	public static void main(String args[])
	{
		
		Demo.myFun();
		First f3 = new First("obj 3"); //name = obj3 assigned
		First f4 = new First("obj 4");  //f3 has no reference so eligible for garbage collection
		
		Runtime.getRuntime().gc(); //To explicitly request for garbage collection
	}
 }