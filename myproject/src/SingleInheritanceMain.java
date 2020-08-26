
class SingleInheritance {
	private int a=20;
	private int b=30;
	protected int add(int a, int b) {
		a=this.a;
		b=this.b;
		int c = a + b;
		return c;
	}
}

public class SingleInheritanceMain extends SingleInheritance {
	public int sub(int c, int d) {
		int e = c - d;
		return e;
	}

	public static void main(String[] args) {
		SingleInheritanceMain s=new SingleInheritanceMain();
		System.out.println(s.add(10, 20));
		System.out.println(s.sub(60,50));

	}
}