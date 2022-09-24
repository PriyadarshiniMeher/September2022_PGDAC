class P8{
	public static void main(String args[]){
		for(int i =1; i<=5;i++){               //row
			for(int j =4; j>=i; j--){       //space
			
			System.out.print(" ");
	
			}
			for(int k =1; k<=i; k++){         //col
			
				System.out.print(5-i+k);
				System.out.print(" ");
	
			}
			
			System.out.println();
		
		}
	
	
	
	
	
	}

}