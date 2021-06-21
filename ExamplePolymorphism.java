package training;

import java.io.IOException;

class A
{
	public Number m1(int a,double b)throws RuntimeException
 	
	{
		System.out.println("superclass");
		return 0;
	}
	
	public double m3(double a,double b)throws RuntimeException
	{
		System.out.println("superclass");
		return 0.0;
	}
	
	public Object m2(char c)
	{
		System.out.println("Object");
        return null;
	}
        
}
 class B extends A
 {
	 @Override
 	public Integer m1(int a,double b) throws ArithmeticException
 	{
 		System.out.println("subclass");
 		return 0;
 	}
	 @Override
	 public Integer m2(char c)
		{
			System.out.println("StringBuffer");
	        return 0;
		}
	 
	 
		
 }
 
public class ExamplePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B();
		a.m1(4, 5.5);
		a.m2('a');
	}

}

/*
 * Integer and Double return type are not compatable
 * If the return type of overridden method in the subclass is a subtype 
 * of the declared return type of overridden  method instead being exactly are called
 *  covariant return type
 *  
 *  superclass return type Object          Number           String           Double        Double,float,Integer
 *  						|	            |				not allowed     not allowed     not allowed
 *  subclass return type   Object,        Number,            object          integer,float  Number
 *  					Integer			integer,float,double
 *  						Number,
 *  				String,String buffer
 *  
 *  
 *  Exceptions:
 *  if super class does not declare any exception and subclass declared checked exception
 *  it will throw error saying subclass cannt override super calss
 *  
 *  if super class does not declare any exception and subclass declared unchecked exception
 *  it will work fine 
 *  
 *  if super class  declare any exception and subclass declares exception other 
 *  than child exception of superclass declared exception throws compile time error
 *  it will work fine 
 *  
 *  if super class declares exception and super class doesnot declare works fine
 * */
