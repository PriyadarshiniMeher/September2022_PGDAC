import java.util.*;

class SQ11
{
	static String mergeString(String s, String t)
	{
		String ans = "";
		int i=0,j=0;
		while(i<s.length() && j<t.length())
		{
			ans += s.charAt(i);
			i++;
			ans+= t.charAt(j);
			j++;
		}
		while(i<s.length())
		{
			ans+=s.charAt(i++);
		}
		while(j<t.length())
		{
			ans+=s.charAt(j++);
		}
		return ans;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String :");
		String s = sc.nextLine();
		System.out.println("Enter second String :");
		String t = sc.nextLine();
		String result = mergeString(s, t);
		System.out.println(s+" + "+t+" = "+result);
	}
}