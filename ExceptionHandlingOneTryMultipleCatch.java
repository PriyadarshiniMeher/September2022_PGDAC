class ExceptionHandlingOneTryMultipleCatch
{
	public static void main(String args[])
	{
		int a =10;
		int b=0;
		int res=0;
		System.out.println("Program Started Execution");
		int arr[] = {5,10,15,20,25};
		
		try
		{
			res = a/b;		// division by zero Exception
			System.out.println(arr[5]);	//ArrayIndex Out of Bound Exception
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Caught"+e.getMessage());
			System.out.println(e.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException Exception Caught"+e.getMessage());
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("result = "+res);
		System.out.println("Exception succesfully Handled");
		
	}
}