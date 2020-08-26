final class Final
{
	final int i=20;
	public final void get(int a,int b)
	{
        System.out.println("a="+a+" "+"b="+b);		
		System.out.println("hi im am final method");
	}
}
class Keyword 
{
	int i=40;
	public void get(int a,int b)
	{
		System.out.println("a="+a+" "+"b="+b);		
	}
	
}
public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Keyword k=new Keyword();
k.get(5, 6);
Final f=new Final();
f.get(5, 6);
//f.i=40;
System.out.println(f.i);
	}

}
