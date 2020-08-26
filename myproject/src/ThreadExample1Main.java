
public class ThreadExample1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample1 r1=new ThreadExample1("first Runnable");
		r1.start();
		//Thread t1=new Thread(r1);
		//t1.start();
		ThreadExample1 r2=new ThreadExample1("second Runnable");
		//Thread t2=new Thread(new ThreadExample1("second runnable"));
		//t2.start();*/
r2.start();
	}

}
