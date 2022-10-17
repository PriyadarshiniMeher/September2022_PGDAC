class StringPoolDemo 
{

	public static void main(String args[ ]) 
	{	
		String s1 = "welcome";
		String s2 = new String("Welcome");
		String s3 = "welcome";
		String s4 = new String("Welcome");
		
		//boolean b = (s1 == 2);
		//System.out.println("s1 == s2"+b);
		
		System.out.println("s1 == s2   "+ ( s1 == s2 ));
		System.out.println("s1 == s3   "+ ( s1 == s3 ));
		System.out.println("s1 == s4   "+ ( s1 == s4 ));
		
		System.out.println("s1.equals(s2)   "+ (s1.equals(s4)));
		System.out.println("s1.equals(s3)   "+ (s1.equals(s3)));
		System.out.println("s1.equals(s4)   "+ (s1.equals("welcome")));
	}
}


