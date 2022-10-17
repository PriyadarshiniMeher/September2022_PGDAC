class BoxingDemo 
{

	static int fun(Integer v) 
	{
	
		return v;
	}
	public static void main(String args[ ]) 
	{	//Direct call not possible
		Integer iob = fun(100);  //non-static method fun(lnteger) cannot be referenced from a static context
		
		
		//without boxing
		
		//Integer iob = new Integer(100);
		//fun(iob);
		//or
		//fun(ne Integer(100))
		
		
		System.out.println(iob);
	}
}