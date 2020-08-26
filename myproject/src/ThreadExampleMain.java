
public class ThreadExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t1=new ThreadExample("FirstThread");
t1.start();
Thread t2=new ThreadExample("Second Thread");
t2.setPriority(Thread.MAX_PRIORITY);
System.out.println(t2.getPriority());
Thread t3=new ThreadExample("Third Thread");
t3.setPriority(Thread.MIN_PRIORITY);
System.out.println(t3.getPriority());
t3.start();
t2.start();
	}

}
