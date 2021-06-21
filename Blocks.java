package training;
class D
{ 
	int d,e;
	int a;
	static int n;
	public D(int d, int e) {
		super();
		this.d = d;
		this.e = e;
		System.out.println("constructor");
	}
	public static  void m4()
	{
		System.out.println("static method");	
	} 
	{
		
		String k="vidhya";
		System.out.println("k:"+k);
		System.out.println("d value"+this.d);
		System.out.println("static variable n:"+n);
		m4();
	}
	
	static 
	{
		int y=50;
		n=90;
		System.out.println("static block");
		m4();
	}
	public int m1()
 	
	{
		System.out.println("m1 method a value=" +a);
		return 1;
	}
	int c=m1();
	public void m3()
	{
		System.out.println("m3 method");	
	} 
	
	{
		a=50;
		System.out.println("a:"+a);
		m3();
	}
}


public class Blocks {
	public static void main(String[] args) {
		D a=new D(10,20);
	}
	
	
}

/*static block 
 * .......
 * executes before instance block.
 * only access static methods and static variables
 * it executes when class is loaded
 * this keyword cannot be used.
 * 
 * instance block
 * ....
 * executes only instance of class is created
 * static and non static variables and methods can be accessed
 * this keyword can be used
 * 
 * 
 * */
 