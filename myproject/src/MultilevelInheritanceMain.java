class MultilevelInheritance1 {
	private int a=20;
	private int b=30;
	protected int add(int a, int b) {
		a=this.a;
		b=this.b;
		int c = a + b;
		return c;
	}
	public MultilevelInheritance1()
	{
		System.out.println("MultilevelInheritance1 contructor");
	}
}

class MultilevelInheritance2 extends MultilevelInheritance1 {
	public int sub(int c, int d) {
		int e = c - d;
		return e;
	}
	public  MultilevelInheritance2()
	{
		System.out.println("MultilevelInheritance2 contructor");
	}
}
public class MultilevelInheritanceMain extends MultilevelInheritance2 {
public MultilevelInheritanceMain ()
{
	System.out.println("MultilevelInheritanceMain contructor");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelInheritanceMain m=new MultilevelInheritanceMain();
	System.out.println(m.add(10, 20));
	System.out.println(m.sub(50,40));
	}

}
