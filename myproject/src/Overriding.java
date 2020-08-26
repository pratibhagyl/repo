
class A {
public A()
{
	System.out.println("super constructor");
}
	public void calPrice(int a,int b)
	{ int c=a-b;
	System.out.println(c);
	}

}
class B extends A
{
	public void calPrice(int c,int d)
	{super.calPrice(50, 40);
		int e=c+d;
		System.out.println(e);
	}
}
public class Overriding extends B
{
	public Overriding(int e,int f)
	{
	System.out.println("hello "+e+f);
	}
	public static void main(String[] args)
	{
		Overriding o=new Overriding(10,20);
	o.calPrice(10, 20);
	}
}