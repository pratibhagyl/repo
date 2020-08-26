
public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b[]=new int[5];
b[0]=0;
UncheckedException c1=new UncheckedException();
try
{
	c1.get();
int c=a/b[7];
}
/*catch(ArithmeticException e)
{
	System.out.println("division by zero");
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("array out of bounds");
}
catch(NullPointerException e)
{
	System.out.println("it is null object");
}*/
//System.out.println(c);
catch(Exception e)
{
System.out.println(e.getClass().getName());
	e.printStackTrace();
System.out.println(e.getLocalizedMessage());
	//System.out.println(c1 instanceof UncheckedException);
if(e instanceof NullPointerException)
{
	System.out.println("null pointer exception");
}
else if(e instanceof ArithmeticException)
{
	System.out.println("Arithmetic Exception");
}
else if(e instanceof ArrayIndexOutOfBoundsException)
{
	System.out.println("Array out of Bounds");
}
else
{
	System.out.println("unknown exception");
}
}

int d=a+b[0];
System.out.println(d);

	}
	public void get()
	{
		System.out.println("i m class");
	}

}
