//java program to remove elements lower than 7 in atreeset

import java.util.*;
class CO20
{
	public static void main(String args[])
	{
		TreeSet<Integer> tr1=new TreeSet<>();
		tr1.add(2);
		tr1.add(10);
		tr1.add(11);
		tr1.add(5);
		tr1.add(3);
		tr1.add(14);
		tr1.add(9);
		tr1.add(2);
		System.out.println("initial values are"+tr1);
		System.out.println("values less than 7 are: "+tr1.headSet(7));


	}
}