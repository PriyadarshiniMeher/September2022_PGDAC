class StringBufferMethodsDemo
{
	public static void main(String args[])
	{
		//StringBuffer s1 = "Welcome";	//Direct cannot initialise bcoz by default it takes as string
		StringBuffer s1 = new StringBuffer("Welcome");
		System.out.println(s1);
		
		
		//append method
		StringBuffer strBuffer = new StringBuffer("Hello ");
		strBuffer.append("Friends");
		System.out.println(strBuffer);	//Print Hello Friends
		
		//insert method
		StringBuffer strBuffer = new StringBuffer("Core");
		strBuffer.insert("Java");
		System.out.println(strBuffer);	// CJavaore
		
		//replace method
		StringBuffer strBuffer = new StringBuffer("Core");
		strBuffer.replace( 2, 4, "Java");	//start, end..replace re with Java
		System.out.println(strBuffer);		//COJava
		
		//reverse method
		StringBuffer strBuffer=new
		strBuffer.reverse();
		System.out.printIn(strBuffer); // eroC
		
		
		//delete method
		StringBuffer strBuffer = new StringBuffer("Core");
		strBuffer.deIete( 2, 4);	//start, end
		System.out.printIn(strBuffer);
		
		
		//capacity method
		StringBuffer strBuffer = new StringBuffer();
		System.out.println(strBuffer.capacity());	//16
		strBuffer.append(" 1234");					//still capacity 16, out of whicch 4 used
		System.out.println(strBuffer.capacity());
		StringBuffer strBuffer = new StringBuffer("12345");	//16+5 = 21	
		System.out.println(strBuffer.capacity());
		strBuffer.append(" 123456789012");	//12 char added
		System.out.println(strBuffer.capacity());	//16(shows initial capacity, but 12 used out of 16 here and previos appen me 4 used, so its full)
		strBuffer.append("1");	//it was full now one more char is added so its capacity is incresed
		System.out.printlp(strBuffer.capacity()); //(oldcapacity*2)+2 prints 34
		
		
		
		
		
		
	}
}