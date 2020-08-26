
public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		a[0] = 10;
		int b = 0;
		MultipleCatch t=null;
		try {
			t.get();
			float c = a[10] / b;
		} 
		
		catch (ArithmeticException e) {
			System.out.println("division by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("out of array boundary");
		}
		catch(Exception e)
		{e.printStackTrace();
		System.out.println(t instanceof MultipleCatch );
		System.out.println(e instanceof ArrayIndexOutOfBoundsException);
			System.out.println("general Exception"+ e.getClass().getName());
		}
		finally {
			System.out.println("finally block");
		}
		
		//System.out.println(a[0] + b);
	}

	public void get() {
		System.out.println("hello");
	}

}
