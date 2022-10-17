class ExceptionDemo
{
	public static void main(String args[])
	{
		int a =10;
		int b=0;
		int res=0;
		System.out.println("calculating Result");
		
		try
		{
			res = a/b;		// division by zero Exception
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Caught");
			System.out.println(e.getMessage());
		}
		
		System.out.println("result = "+res);
		System.out.println("Program Succesfully Executed");
		
	}
}