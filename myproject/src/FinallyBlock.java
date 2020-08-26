
public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
//int b=2;
int b=0;
//when there is no exception occurs
/*try
{
int c=a/b;
}
finally
{
	System.out.println("finally is always executed");
}
System.out.println("rest of the code");
	}

//when there is an exception and not handled
try
{
	int c=a/b;
}
finally
{
	System.out.println("finally is always executed");
}
System.out.println("rest of the code");*/
//when there is an exception and is handled
try
{
	int c=a/b;
}
catch(ArithmeticException e)
{
	System.out.println("division by zero");
}
finally
{
	System.out.println("finally is always executed");
}
System.out.println("rest of the code");
	}

}
