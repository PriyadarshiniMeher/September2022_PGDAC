//  java program to empty an hashset

import java.util.HashSet;
class CO16
{
	public static void main(String args[])
	{
		HashSet<String> h1=new HashSet<String>();
		h1.add("cdac");
		h1.add("ADS");
		h1.add("OOps");
		h1.add("Web devlopment");
		h1.add("Aptitude");
		System.out.println("displaying the hashset:"+h1);

		h1.clear();
		System.out.println("final set"+h1);


	}

}