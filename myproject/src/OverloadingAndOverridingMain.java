class Base
{
	public Base()
	{
		System.out.println("constructor base");
	}
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(String a,String b)
	{
		String c=a+b;
		System.out.println(c);
	}
}
//Class Derived
class Derived extends Base
{
	public Derived()
	{super();
		System.out.println("constructor Derived");
	}
	public void add(int a,int b)
	{super.add(10, 20);
		int c=a+b;
		System.out.println(c);
	}
	public void add(String a,String b)
	{super.add("abc","def");
		String c=a+b;
		System.out.println(c);
}
}
public class OverloadingAndOverridingMain {
	public static void main(String[] args)
	{
		/*Base a1=new Base();
		a1.add(10,20);
		a1.add("abc","def");*/
		Derived b1=new Derived();
		b1.add(30, 40);
		b1.add("ghi","jkl");
	}

}
