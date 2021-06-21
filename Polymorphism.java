package training;
class  Bank
{
	private String name;
	protected static double balance;
	
	
	public int  deposit(Integer amount)
	{
		balance=balance+amount;
		System.out.println();
		return (int)balance;
	}
	public int deposit(Double amount)
	{
		balance=balance+amount;
		System.out.println("Number");
		return (int)balance;
	}
	public int deposit(double amount)
	{
		balance=balance+amount;
		System.out.println("primitive");
		return (int)balance;
	}
	public double withDraw(double amount)
	{
		balance=balance-amount;
		return balance;
	}
	public String message()
	{
		return "Bank Account";
	}
	
	
}

class Saving extends Bank
{
	
	public String message()
	{
		return "saving  Account";
	}
	
	
}
 

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank s=new Saving();
		System.out.println(s.message());
		 int x=100;
		System.out.println(s.deposit(x));
		double y=100;
		System.out.println(s.deposit(y));
		
	
	}

}
