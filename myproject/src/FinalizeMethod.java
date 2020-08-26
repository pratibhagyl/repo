public class FinalizeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FinalizeMethod f=new FinalizeMethod();
f=null;
System.gc();
System.out.println("end of garbage collection");
	}
public void finalize()
{
	System.out.println("finalize method is executed");
}
}
//case 1:class's object is destroyed by calling the finalize() in its own class.
//public class FinalizeMethod
//{
//	public static void main(String[] args)
//	{
//		String f=new String();
//		f=null;
//		System.gc();
//		System.out.println("end of garbage collection");
//			}
//		public void finalize()
//		{
//			System.out.println("finalize method is executed");
//		}
//		
//	}
//case2:when finalize() is called explicitly but object is not destroyed
//public class FinalizeMethod {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//FinalizeMethod f=new FinalizeMethod();
//f.finalize();
//f.finalize();
//f=null;
//System.gc();
//System.out.println("end of garbage collection");
//	}
//public void finalize()
//{
//	System.out.println("finalize method is executed");
//}
//}
//case3:when finalize() is called explicitly and exception is thrown
//public class FinalizeMethod {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//FinalizeMethod f=new FinalizeMethod();
//f.finalize();
//f.finalize();
//f=null;
//System.gc();
//System.out.println("end of garbage collection");
//	}
//public void finalize()
//{
//	System.out.println("finalize method is executed");
//	System.out.println(10/0);
//}
//
//}
//case4:when finalize() is called by garbage collector and exception is thrown
//public class FinalizeMethod {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//FinalizeMethod f=new FinalizeMethod();
//f=null;
//System.gc();
//System.out.println("end of garbage collection");
//	}
//public void finalize()
//{
//	System.out.println("finalize method is executed");
//	//System.out.println(10/0);
//	try
//	{
//	System.out.println(10/0);
//	}
//	catch(ArithmeticException e)
//	{
//		System.out.println("division by zero");
//	}
//}
//
//}