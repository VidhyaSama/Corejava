package training.Java8;

import training.Java8.Outer2.Inner3;

public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o=new Outer();
		Outer.Inner i= o.new Inner();
		Outer2 o1=new Outer2();
		Outer2.Inner3 i1= new Outer2.Inner3();//with outer class
		Inner3 p=new Inner3();//without outer class
		System.out.println(i.b);
		i.mul(4, 3);
		i.sub(4, 3);
		o.add(4, 3);
		i1.mul(9, 10);
		p.mul(9, 10);
		
		
	}

}

class Outer extends Outer2
{
	 private static int a=10;
	public void add(int x,int y)
	{
		System.out.println(x+y);
		
	}
	
	class Inner extends Inner3 //inner class should contain static members
	
	{
		 int b=60; 
		@Override
		public void mul(int x,int y)
		{
			
			System.out.println(x*y);
		}
		public  void sub(int x,int y)
		{
			System.out.println(a);
			System.out.println(x-y);
		}
	}
	class Inner2 extends Inner
	{
		public void sub(int x,int y)
		{
			System.out.println(a);
			System.out.println(x-y);
		}
	}
}

class Outer2
{
	static int k=9;
	static class Inner3
	{
		public void mul(int x,int y)
		{
			
			System.out.println(x*y);
		}
	}
}


  /*
   * Inner class inherit outer class members and other inner class of its outer class 
   * Inner class also access private members of outer class
   * Inner class can inherit  outer outer classes inner class if its enclosed class extends outer class.
   * outer class cannot access inner class members.
   * 
   * if inner class  is static it is not associated with outer class object .But it is not possible in normal inner class.
   * */
   