class Singleton
{
	static Singleton s1;
	private Singleton()
	{
	}
	public static Singleton buildObject()
	{
		if(s1==null)
		{
			s1=new Singleton();
		}
	return s1;
	}
	public void get()
	{
		System.out.println("hello");
	}
}
public class SingletonScope
{
	public static void main(String[] args)
	{
		Singleton s2=Singleton.buildObject();
		s2.get();
		
	}
}
