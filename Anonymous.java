package training.Java8;

interface Number1
{
	public int largest(int n1,int n2);	
	public int add(int n1,int n2);	
	
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
interface Number2
{
	public String value();
}
public class Anonymous {
	
	public static void main(String[] args) {
		int y=10;
		Number1 n=new Number1(){ 
			
			//here n is not object of interface its a object of class
			int balance=100;
			@Override
			public int largest(int n1,int n2)
			{
				System.out.println(y);
				if(n1>n2)
					return n1;
				else
					return n2;
			}


			@Override
			public int add(int n1, int n2) {
				// TODO Auto-generated method stub
				return n1+n2;
			}
		};
		System.out.println(n.largest(10,20));
		 Anonymous k= new  Anonymous();
		 Number2 p=k.create();
		 System.out.println(p.value());
		
		
	}
	public Number2 create()
	{
		Number2 n=new Number2(){
		String name="pallavi";

		@Override
		public String value() {
			// TODO Auto-generated method stub
			return this.name;
		} 
		
		};
		return n;
	}


}

/*
 * normal class                                                anonymous inner class
 * A normal class can extend one class							can extend a (1)class or implements an (1)interface but not 
 * and implements any number of interfaces          			both at a time (
 * constructors can defined                                     no constructors because no class name
 * 																
 * 																this refers to current anonymous inner class object but not outer calss
 * */
