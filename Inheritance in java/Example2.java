abstract class Bank
{
	public abstract void getBalance();
}

class BankA extends Bank
{
	public void getBalance()
	{
		System.out.println("\n\nYou have $100.");
	}	
}

class BankB extends Bank
{
	public void getBalance()
	{
		System.out.println("\n\nYou have $150.");
	}	
}
class BankC extends Bank
{
	public void getBalance()
	{
		System.out.println("\n\nYou have $200.");
	}	
}

class Example2
{
	public static void main(String args[])
	{
		BankA a = new BankA();
		BankB b = new BankB();
		BankC c = new BankC();
		
		a.getBalance();
		b.getBalance();
		c.getBalance();
	}
}