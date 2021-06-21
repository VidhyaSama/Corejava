package training;

abstract class BankAccount
{
	static  int x=100;
	int y=10;
	static int n;
	public BankAccount(int n) {
		super();
		this.n = n;
	}
	private int z=20;
	public int getZ() {
		return z;
	}
	public void viewAccountNumber()
	{
		System.out.println("AcNo:123456");
	}
	public static void bankAddress()
	{
		System.out.println("Address:Banglore");
	}
	
	abstract void checkBalance();
	abstract void acountHolderName();
	
}

abstract class SavingAccount extends BankAccount
{
	{
		System.out.println("Hello i am block");
		System.out.println(this.n);
		y=50;
	}
	
	
	public SavingAccount(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void checkBalance() {
		System.out.println("printing y fron saveAccount" +y);
		
	}
	
	
}


public  class ExampleAbstraction extends SavingAccount{
	
	
	public ExampleAbstraction(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleAbstraction  ab=new ExampleAbstraction (2);
		ab.viewAccountNumber();
		ab.checkBalance();
		bankAddress();
		ab.bankAddress();
		ab.y=40;
		ab.acountHolderName();
		System.out.println("value of x :" +x);
		System.out.println("value of y changed in Example Abstraction:" +ab.y);
		System.out.println("value of z :" +ab.getZ());
		a();
		
	}

	@Override
	void acountHolderName() {
		System.out.println("Account holder name:Vidhya");
		System.out.println("value of y :" +y);
		System.out.println(this.n);
	}

	static void a()
	{
		System.out.println("value of x in static "+x);
	}

}

/*1)to access account number we can't create instance for BankAccount 
so we have to create subclass from abstract class.
2) Modifiers allowed for the abstract methods are protected and public (by default).
it cannot be private because it cannot be accessed outside.
3)if a class has abstract method then the class should be declared abstract
4)if a class extends abstract class then all the abstract methods has
 to be implemented in absence the class should be declared abstract.
 5)variables can be declared as static ,final,public,private and protected.
 private variables can be accessed using getters and setters.
 6) need create constructor for the variables declared in parent classes in their respective subclasses.
7)this and super cannot be used in static methods because as they refer to the current and parent instance
as static method they link to the class but not the object. 

*/