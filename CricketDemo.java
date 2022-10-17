class Cricketer
{
		String name;
		String country;
		int totNoMatches;
		void SetDetails(String name, String country, int totMoMatches)
		{
		
			int totRuns;
		
		}
		void printDetails()
		{
			System.out.println(name);
			System.out.println(country);
			System.out.println(totNoMatches);
		}

}
class Batsman extends Cricketer
{
	int totRuns;
	void 
}
class Bowler extends Cricketer
{
	int totwickets;
}
class CricketDemo
{
	public static void main(String args[])
	{
		Cricketer c1 = new Cricketer();
		c1.SetDetails("Sachin","India", 15000);
		c1.printDetails();
		
		Batsman.bats1 = new Batsman();
		bats1.SetDetails("Rishabh Pant", "India", 1000);
		bats1.setTotRuns(3000);
		bats1.printDetails();
		bats1.printTotRuns();
		
		Bowler bow1 = new Bowler();
		bow1.setDetails("Bhumrah", "India", 100);
		bow1.setTotWickets(350);
		bow1.printDetails();
		bow1.printTotWickets();
		
	
	}
}