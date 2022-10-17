class WrapperDemo
{
	public static void main(String args[])
	{
		//Double dobj = new Double(53.5);
		//Double dobj = new Double("53.5");
		//System.out.println(dobj);			 //System.out.println(d.toString());
		
		Double dobj = Double.valueOf("53.5");
		double dp = Double.parseDouble("53.5");
		
		Double dobj1 = new Double("53.5");
		Double dobj2 = new Double("54.5");
		Double dobj3 = new Double("50.5");
		
		int ip = Integer.parseInt("537");
		
	
		String s = dobj.toString();
		//System.out.println(dobj.toString());
		int res1 = dobj.compareTo(dobj1); 
		int res2 = dobj.compareTo(dobj2);
		int res3 = dobj.compareTo(dobj3);
   		//returns 0 if equal ,,,returns +1 or -1 if unequal
		
		System.out.println("dobj.compareTo(dobj1) : "+res1);
		System.out.println("dobj.compareTo(dobj2) : "+res2);
		System.out.println("dobj.compareTo(dobj3) : "+res3);
		
		double dp1 = dobj1.doubleValue();
        byte bp = dobj1.byteValue();	//bp will have value 2
        int ip1 = dobj1.intValue();	//ip1 will have value 258
                
        System.out.println(dobj.equals(dobj1));
                
        Integer iobj = new Integer("567");
        Integer iobj1 = new Integer("566");
        System.out.println(iobj.equals(iobj1));
                      
	
	}
}