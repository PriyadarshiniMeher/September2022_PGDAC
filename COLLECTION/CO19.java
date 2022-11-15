
//java program to create a TreeSet
import java.util.*;

public class CO19
{
	public static void main(String args[])
	{
		TreeSet<String> tr1=new TreeSet<String>();
		tr1.add("red");
		tr1.add("blue");
		tr1.add("violet");
		tr1.add("maroon");
		tr1.add("purple");
		
		Iterator <String> it1=tr1.iterator();
		
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}

	}
}