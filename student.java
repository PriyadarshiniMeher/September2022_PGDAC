import java.util.*;
class student{

	void print_Details(int roll, string name, double marks){
		System.out.println(" Student Name : "+name);
		System.out.println(" Student Roll : "+roll);
		System.out.println(" Student Marks : "+marks);
	}
	
	void change_Marks(marks){
		System.out.println(" Enter new marks of student : "+marks);
	}
	
	void add_Details(roll, name, marks){
	
	}


	public static void main(String args[]){
	
		Scanner sc = new Scanner(Syatem.in);
		System.out.println(" Enter Student Roll No. : ");
	 
		 //data members
		 
		 int roll= sc.nextInt();
		 System.out.println(" Enter Student Name : ");
		 String name = sc.nextLine();
		 System.out.println(" Enter Student marks : ");
		 double marks = sc.nextDouble();
		  
		  //methods
		  void print_Details(roll, name, marks);
		  void change_Marks(marks);
		  void add_Details(roll, name, marks);
		
	}
}

