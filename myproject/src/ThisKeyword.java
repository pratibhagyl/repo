
public class ThisKeyword {
	int a=10;
	int b=20;
	int sum;
	String name="abc";
	public void set(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+" "+b);
		sum=a+b;
	}
	public void setName(String name)
	
	{
		System.out.println("name is"+name);
		System.out.println("this.name is"+this.name);
	}
	public int get()
	{//sum=a+b;
		return sum;
		//System.out.println();
	}
}
