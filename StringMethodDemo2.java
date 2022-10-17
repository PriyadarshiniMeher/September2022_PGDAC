class StringMethodDemo2{
	public static void main(String[] args)
	{
		String strl "cool string";
	String str2 = "88";
	String fstr = String.format("My String is: %l$s, %l$s and 0/02Ss", strl, str2);
	System.out.println(fstr);
	
	
	
	
	//Left Padding with Zero
	int str = 88;
	String formattedString = String.format("%05d", str);	//%d is for integer
	System.out.println(formattedString);	// 00088
	
	
	
	
	//Displaying String, int, hexadecimal, float, char, octal value using format() method
	String strl = 15); // Integer value
	String str2 = String.format("%s", "cdac.in"); // String
	String str3 = String.format("%f", 16.10); // Float value
	String str4 = String.format("%x", 189); // Hexadecimal value
	String str5 = String.format("%c", 'P'); // Char value
	String str6 = String.format("%o", 189); // Octal value
	
	
	
	
	
	
	
	
	}
}