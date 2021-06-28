package training;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eligibility e=new Eligibility();
		try
		{
		e.checkAge(18);
		e.Nationality("aust");
		}
		catch(VoteException ex)
		{
			System.out.println(ex.getMsg());
		}
	}

}

class Eligibility 
{
	public void checkAge(int age) throws InvalidAgeException
	{
		if(age>=18)
		{
			System.out.println("eligible to take Debit card");
		}
		
		else
		{
			throw new InvalidAgeException("Not eligible to take Debit card");
		}
	}
	
	public void Nationality(String n) throws NotAnIndianException
	{
		if(n.equalsIgnoreCase("India"))
		{
			System.out.println("Indian");
		}
		else
		{
			throw new NotAnIndianException("Don't have citizenship");
		}
	}
	
}
class VoteException extends Exception
{
	String msg;

	public String getMsg() {
		return msg;
	}

}

class InvalidAgeException extends VoteException
{
	
	public InvalidAgeException(String msg) {
		super();
		this.msg = msg;
	}
	
}
class NotAnIndianException extends VoteException
{
	

	public NotAnIndianException(String msg) {
		super();
		this.msg = msg;
	}
	
}
