class switchcase1{
	public static void main(String args[]){
	
		int day=3;
		String Dayname;
		
		switch (day){
			 case 1:
			 Dayname = "Today is Monday";
			 break;
			 
			 case 2:
			 Dayname = "Today is Tuesday";
			 break;
			 
			 case 3:
			 Dayname = "Today is Wednessday";
			 break;
			 
			 case 4:
			 Dayname = "Today is Thursday";
			 break;
			 
			 case 5:
			 Dayname = "Today is Friday";
			 break;
			 
			 case 6:
			 Dayname = "Today is Saturday";
			 break;
			 
			 case 7:
			 Dayname = "Today is Sunday";
			 break;
			 
			 default:
			 Dayname = "Invalid Day";
			 
		
		}
		
		System.out.println("Day is "+Dayname);
	
	
	
	}
}