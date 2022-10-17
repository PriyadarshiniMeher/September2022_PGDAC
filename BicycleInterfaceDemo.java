interface Bicycle
{
	int a= 45;
	void applyBrake(int Decrement);
	void speedup(int increment);
}
interface HornBicycle
{
	
	void blowHornK3G();
	void blowHornDhoom();
}


 class AvonCycle implements Bicycle, HornBicycle
 {
	void blowhorn()
	{
		System.out.println("Pee Pee Poo Poo");
	}
	public void applyBrake(int decrement)
	{
		System.out.println("Applying break");
	}
	public void speedup(int increment)
	{
		System.out.println("Applying SpeedUP");
	}
	public void blowHornK3G()
	{
		System.out.println("Kabhi Khushi Kabhi Gum Pee Pee Pee Pee");
	}
	public void blowHornDhoom()
	{
		System.out.println("Dhoom Dhoom Poo Poo Poo Poo");
	}
	
 }
 
 public class BicycleInterfaceDemo
 {
	public static void main(String args[])
	{
		AvonCycle BabyCycle = new AvonCycle();
		BabyCycle.applyBrake(1);
		System.out.println(BabyCycle.a);
		
		//You can create properties in interfaces
		//BabyCycle.a = 454;
		//System.out.println(BabyCycle.a);
		//You cannot modify the properties in interface as they are final
		
		BabyCycle.blowHornK3G();
		BabyCycle.blowHornDhoom();
		
	}
 }