class StringMethodDemo1{
	public static void main(String[] args)
	{
		
		String s1 = "Welcome";
		String s2 = new String("Welcome");
		String s3 = "Welcome";
		String s4 = new String("Welcome");
		
		System.out.println("\nShallow Comparison");
		System.out.println("s1==s2 returns: "+(s1==s2));	//false
		System.out.println("s1==s3 returns: "+(s1==s3));	//true
		System.out.println("s3==s4 returns: "+(s3==s4));	//false
		
		System.out.println("\nDeep Comparison");
		System.out.println("s1.equals(s2) returns: "+(s1.equals(s2)));	//false
		System.out.println("s1.equals(s3) returns: "+(s1.equals(s3)));	//true
		System.out.println("s1.equals(s4) returns: "+(s1.equals(s4)));	//false
		
		System.out.println("\nString Methods");
		System.out.println("\ncharAt");
		System.out.println("s1.charAt(0) returns: "+s1.charAt(0));
		char ch = s1.charAt(1);
		System.out.println("s1.charAt(0) returns: "+ch);
		//	System.out.println("s1.charAt(0) returns: "+s.[2]);	//error: <identifier> expected
		
		System.out.println("\ngetChars");
		System.out.println(".................");
		char chr[] = new char [10];
		s1.getChars(2,5,chr,0);		//start,end,destination,no of spaces
		
		for(int i = 0; i <chr.length;i++){
		System.out.println(chr[i]);
		}
		
		System.out.println(".................");
		char chr1[] = new char [10];
		s2.getChars(2,5,chr1,2);
		for(int i = 0; i <chr.length;i++){
		System.out.println(chr1[i]);
		}
		
		System.out.println("\ngetBytes");
		byte [] b = s1.getBytes();
		for(int i = 0; i <b.length;i++){
		System.out.println(b[i]);
		}
		
		
		System.out.println("\nequals & equalsIgnoreCase");
		
		String s5 = "WELcome";
		String s6 = "welCOME";
		System.out.println("s5.equals(s6) returns "+s5.equals(s6));
		System.out.println("s5.equalsIgnoreCase(s6) returns "+s5.equalsIgnoreCase(s6));
		
		System.out.println("\ntoCharArray");
		
		String s7 = "Welcome";
		char charr [] = s7.toCharArray();
		System.out.println("s7 returns "+s7);
		//System.out.println("s7.toCharArray() returns "+s7.toCharArray());
		//System.out.println("s7.toCharArray() returns "+charr);
		
	System.out.println("Print Array using for-each loop");
		for(char x : charr){
		System.out.print(x);
		}
		
		System.out.println("...........");
		System.out.println("compareTo");
		String s8="ABBACCD";
		String s9="ABHSVDC";
		
		System.out.println("s8.compareTo(s9) returns : "+s8.compareTo(s9));
		//returns difference of ASCII value
		
		System.out.println("...........");
		System.out.println("substring() method");
		System.out.println("saregama".substring(3));	//egama-argument is starting index
		
		System.out.println("...........");
		System.out.println("concat() method");
		String str10="HELLO";
		str10=str10.concat("chutiya").concat("logon");
		System.out.println(str10);
		
		System.out.println("...........");
		System.out.println("replace() method");
		String str11 = "jiya joy";
		System.out.println(str11.replace('j','t'));
		
		System.out.println("...........");
		System.out.println("substring() method");
		String str12 = "cdac.in";
		System.out.println(str12.replaceFirst("in","net"));
		
		System.out.println("...........");
		System.out.println("replaceAll() method");
		//ye hr jgh replace krega
		
		System.out.println("...........");
		System.out.println("indexOf() method");
		System.out.println("welcome".indexOf('m'));
		System.out.println("welcome".indexOf("com"));
		//nhi mila to -1 return krega
		
		
		System.out.println("...........");
		System.out.println("int indexOf(char ch,int fromIndex) method");
		
		System.out.println("...........");
		System.out.println("boolean contains() method");
		System.out.println("rajkumar sinha".contains("mar"));
		
		System.out.println("...........");
		System.out.println("boolean isEmpty() method");
		System.out.println("abc".isEmpty());
		String s13="";		//true
		System.out.println(s13.isEmpty());
		
		
		System.out.println("...........");
		System.out.println("join(delimeter,str1,str2,str3) method");
		System.out.println(String.join("/","13","10","2022"));	
		
		
		System.out.println("...........");
		System.out.println("split() method");
		String str14 = new String("30/08/2020");
		String array1[] = str14.split("/");
		for(int i=0;i<array1.length;i++)
		{
			System.out.println(array1[i]);
		}
		System.out.println();
		 //split method
        String s="av@hf@gg";
        String arr[]=s.split("@");
        for(String x:arr)
		{
            System.out.println(x);
		}
		
		
		
		
		
		
	}
}