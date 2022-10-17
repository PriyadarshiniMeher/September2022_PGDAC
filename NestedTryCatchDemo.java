class NestedTryCatchDemo
{
	public static void myfun()
	{
		int arr[] = {5,10,15,20,25};
		try
		{
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException Exception Caught Here");
		}
		finally
		{
			System.out.println("finally inner block");
		}
	}
	
	public static void main(String args[])
	{
		int a =10;
		int b=2;
		int res=0;
		System.out.println("Program Started Execution");
	
		
		try
		{
			res = a/b;		
			myfun();		//Nested try catch..myfun() is replaced by try catch final block inner
		}
		catch(ArithmeticException e)		
		{
			System.out.println("Arithmetic Exception Caught Here");
			System.out.println(e.getMessage());
		}
		catch(Exception e)		
		{
			System.out.println("Exception Caught"+e.getMessage());
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("finally outer block");
		}
		System.out.println("result = "+res);
		System.out.println("Exception succesfully Handled");
		
	}
}