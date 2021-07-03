package training.Java8;

@FunctionalInterface
interface Number
{
	
	//public int largest(int n1,int n2);
	public String value();
	public default void message()
	{
		System.out.println("Functional interface");
	}
	public default void message2()
	{
		System.out.println("Lambda Exp");
	}
	public static  int min(int m1,int m2)
	{
		if(m1<m2)
			return m1;
		else
			return m2;
	}
}



public class FunInterface  {
	String name="Vidhya";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Number n=(n1,n2)->{
//			if(n1>n2)
//				return n1;
//			else
//				return n2;
//		};
//		System.out.println(n.largest(2,3));
		
		System.out.println(Number.min(10, 16));
//		n.message();
//		n.message2();
		FunInterface t= new FunInterface();
		Number p1=t.create();
		System.out.println(p1.value()); //Vidhya

	}

	public Number create()
	{
		Number n=()->{
		String name="pallavi"; 
		return this.name;
		};
		return n;
	}

}

/*
 * FT contains only one abstract method (because lambda expression are used to implement FI) its good practice 
 * to declare the @FunctionalInterface.so that in future other abstract method cannot be declare in FI.
 * 
 * we have default and static methods in FI(default methods can be overridden,static method cannot be overriden)
 * static method is part of interface not part of its instance 
 * 
 * in lambda expression this always refers to current outer class(enclosing class)
 * 
 * 
 * */
