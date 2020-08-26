
public class ReturnInFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnInFinally m=new ReturnInFinally();
		System.out.println(m.get());

	}
	public int get()
	{
		try
		{
			int c=10/0;
			return c;
		}
		finally
		{
			System.out.println("this is finally block");
			System.out.println(10+20);
	//return 0;
		}
		//System.out.println("hello");
	}

}
