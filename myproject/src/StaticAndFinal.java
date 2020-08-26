class Static
{
	static float pi=3.14f;
	static String Google_URL="http:\\yahoo.com";
	final int i=10;
	public static void area (int r)
	{
		float area=pi*r*r;
		System.out.println(area);
	}
}
public class StaticAndFinal {
public static void main(String[] args)
{
	Static s=new Static();
	System.out.println(Static.pi);
	//Static.pi=22/7;
	//System.out.println(Static.pi);
	System.out.println(Static.Google_URL);
	Static.Google_URL="http:\\google.com";
	System.out.println(Static.Google_URL);
	System.out.println(s.pi);
	Static.area(6);
	s.area(10);
	System.out.println(s.i);
}
}
