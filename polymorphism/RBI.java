package polymorphism;

public abstract class RBI {
	 //instance variables 
	public double deposit;
	public double withdrawal;
	public double balance=10000.00;
	public RBI()
	{
		System.out.println("WEclome to RBI regulatory......");
	}
	
	//Methods
	double getMinAmount()
	{
		return 1000.00;
	}
	//abstract methods - are the methods without any body 
	public abstract void calculateInterest();
	public abstract void getbalance();
	

}
