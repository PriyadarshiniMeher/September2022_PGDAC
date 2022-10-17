class SingleCatchMultipleExceptionDemo
{
	public static void main(String args[])
	{
		int a =10;
		int b=2;
		int res=0;
		int arr [] = {5,10,15,20,25};
		System.out.println("Program Started Execution");
	
		
		try
		{
			res = a/b;		
			System.out.println(arr[5]);		
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)		
		{
			System.out.println("Arithmetic Exception or ArrayIndexOutOfBoundsException Caught Here");
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