class MyException extends Exception 	//checked Exception
{

}

class UserDefinedExceptionDemo
{
	public static void main(String args[])
	{
		System.out.println("Program Execution Successfully");
		try
		{
			throw new MyException();
		}
		catch(MyException ae)
		{
			//code
		}
		System.out.println("Program Terminated Successfully");
	}
}