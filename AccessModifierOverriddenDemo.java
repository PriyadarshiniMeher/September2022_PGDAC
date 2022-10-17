interface DBDriver
{
	void createConnection() ;
	void getConnection();
	void closeConnection();
}
class OracleDBDriver implements DBDriver //OracIeDBDriver is the implementing class
{
	void createConnection()
	{
		System.out.printIn("createConnection of Oracle");
	}

	void getConnection()
	{
		System.out.printIn("getConnection of Oracle");
	}
	void closeConnection()
	{
		System.out.printIn("closeConnection of Oracle");
	}
}
 
 class InterfaceDemo
 {
	 
	 public static void main(String args[])
	 {
			OracleDBDriver oracDriver = new OracleDBDriver() ;
			oracDriver. createConnection ( ) ;
			oracDriver. closeConnection( ) ;
			DBDriver dbdriver;
			dbdriver = new OracleDBDriver();
			dbDriver.createConnection();
			dbdriver.closeConnection();
		 
	 }
 }