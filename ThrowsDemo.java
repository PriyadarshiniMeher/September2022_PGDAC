class ThrowsDemo
{
	public static void myfun() throws ArithmeticException
	{
		//code
	}
	public static void main(String args[])
	{
		System.out.println("Program Started Execution");

		try
		{
			myfun();
		}
		catch(ArithmeticException e)		
		{
			System.out.println(" Exception caught here : "+e.getMessage());
		}
		
		System.out.println("Program Terminated Execution");
	}
}