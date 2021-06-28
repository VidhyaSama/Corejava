package training;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {

	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Division div=new Division();
		Test test= new Test();
		test.display();
		System.out.println("exceuted");
		try
		{
			div.divide(3, 0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception");
		}
		catch(RuntimeException e)
		{
			System.out.println("exception");
		}
		
		finally
		{
			System.out.println("division");
		}
		

}
}

class Test 
{
	public void display() 
	{
		
		try(FileInputStream input= new FileInputStream("C:\\Users\\vidhya\\Desktop\\Simple.java")){
			System.out.println("file opened");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
				
	}
	
}


class Division
{
	public int divide(int n1,int n2) 
	{
		
		return n1/n2;
	}
}

/*
 1)try must follow "0 or n " number of catch blocks or 1 finaly block else its lead to compile time error.
 2)Throws should be written after method signature.
 3)if there are multiple catch block for single try of same hierarchy the the catchblock having heigher level should be at last
 4)try with resource=try+finally
 */