class HierarchicalInheritance1 {
	private int a=20;
	private int b=30;
	protected int add(int a, int b) {
		a=this.a;
		b=this.b;
		int c = a + b;
		return c;
	}
	public HierarchicalInheritance1()
	{
		System.out.println("HierarchicalInheritance1 contructor");
	}
}

class HierarchicalInheritance2 extends HierarchicalInheritance1 {
	public int sub(int c, int d) {
		int e = c - d;
		return e;
	}
	public HierarchicalInheritance2()
	{
		System.out.println("HierarchicalInheritance2 contructor");
	}
}
public class HierarchicalInheritanceMain extends HierarchicalInheritance1 {
public HierarchicalInheritanceMain ()
{
	System.out.println("HierarchicalInheritanceMain contructor");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HierarchicalInheritanceMain h=new  HierarchicalInheritanceMain();
		 System.out.println(h.add(10, 20));
		 HierarchicalInheritance2 h1=new  HierarchicalInheritance2();
		 System.out.println(h1.sub(50,40));
		 System.out.println(h1.add(10, 20));
		 MultilevelInheritanceMain m=new MultilevelInheritanceMain();
			System.out.println(m.add(10, 20));
			System.out.println(m.sub(50,40));
	}

}
