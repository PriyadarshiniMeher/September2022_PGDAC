class ThrowDemo
{
	public static void main(String args[])
	{
		
		System.out.println("Program Started Execution");
		int a =-1;
		
		try
		{
			try
			{
				if(a<0)
				{
					ArithmeticException ae = new ArithmeticException("value cannot be negative");	//created an exceptin  object
					throw ae;					//ae EXCEPTIONobject is thrown
				}
			}
			catch(ArithmeticException e)		//ae to e
			{
				System.out.println("Arithmetic Exception caught here : "+e.getMessage());		//object passed, but message same
				throw e;		//RETHROWING AN EXCEPTION
			}
			finally
			{
				System.out.println("finally block");
			}

		}
		catch(Exception e)		//e  of line 21 to e 30
		{
			System.out.println(" Exception caught here : "+e.getMessage());
		}
		
		System.out.println("Program Terminated Execution");
	}
}