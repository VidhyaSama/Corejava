package training.Java8;

public class MethodLocal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodLocal p=new MethodLocal ();
		p.m1();
	}
	
	public void m1()
	{
		int n1=100;
		class Inner
		{
			Inner(String name)
			{
				System.out.println(name);
			}
			public void add(int x,int y)
			{
				System.out.println(x+y);
			}
		}
		Inner n=new Inner("vidhya");
		n.add(10, 20);
	}

}

/*to define method specific repeatedly required functionality
 * we can access method local inner classes only within the method in which declared
 * This has the less scope 
 * */
