
/*public class NestedTryAndCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0;
		int c[]=new int[4];
		c[0]=5;

		try
		{
			try
			{
				try
				{
					int d=a/b;
					System.out.println(d);
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println(e);
				}
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
catch(Exception e)
	{
	System.out.println(e.getClass().getName());
	}
}

}*/
public class NestedTryAndCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0;
		int c[]=new int[4];
		c[0]=5;
		NestedTryAndCatch n=null;
			try
			{
				try
				{
					int d=a/b;
					System.out.println(d);
				}
				catch(ArithmeticException e)
				{
					System.out.println("Division by zero");
				}
			try
			{
				n.get();
				int e=a/c[10];
				System.out.println(e);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Division by zero");
			}
				
		}
			
		
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero");
		}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("array out of boundary");
			}
			catch(Exception e)
			{
			System.out.println(e.getClass().getName());
			e.printStackTrace();
			System.out.println(e.getMessage());
			}

}
public void get()
{
	System.out.println("hello");
}
}