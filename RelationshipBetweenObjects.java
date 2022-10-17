//Employee HAS_A BankAccount
class BankAccount
{
	//code
}
class Employee
{
	//code
}
class EmployeeBankAccouniI
{
	Employee emp;
	BankAccount bankAcct;
}

//Composition (PART OF) example:



class Address
{
	String addresslinel;
	String addressline2;
	String city;
	String state;
	String pin;
	}
class Employee
{
	int Empld;
	Address addr; //Composition , Addressl is used with Employee only
}


//IS_A Relationship example;

class Cricketer
{
	
}
class Batsman extends Cricketer
{

}
 class Bowlwer extends Criketer
 {
 
 }
 
 //Batsman IS_A Cricketer.
// Bowler IS_A Cricketer.