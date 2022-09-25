import java.util.Scanner; 
class P2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in); //Scanner class in java
		System.out.print("Enter the rows you want");
		int rows=sc.nextInt();
		System.out.println("");
		for(int i=1; i<=rows; i++){
			for(int j=0; j<rows-i; j++){
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++){
				System.out.print(k+" ");
			}
			System.out.print("\n");
        }
    }
}
