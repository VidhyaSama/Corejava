package training.Java8;

public class MethodlocalLambda {
	int x=200;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodlocalLambda t = new MethodlocalLambda();
		t.m2();
		System.out.println(t.x);
		
	}
	public void m2()
	{
		int n1=100;
		calc c=()->{
			//System.out.println(n1); 
			x=200;
			System.out.println(x);
		
		};
		n1=90;
		System.out.println(n1);
		c.m1();
	}
}
interface calc
{
	public void m1();
}
/*
 * Method local variable which is referenced from lambda are final or effectively declared final
 * if it is not used in lambda it is not final.
 * */
 