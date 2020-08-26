
public class JoinInThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t1=new Thread(new ThreadExample1("first thread"));
Thread t2=new Thread(new ThreadExample1("second thread"));
Thread t3=new Thread(new ThreadExample1("third thread"));
t1.start();
try
{
	t1.join(2000);
}catch(Exception e)
{
	e.printStackTrace();
}
t2.start();
t3.start();
/*try
{
	t1.join();

}catch(Exception e)
{
	e.printStackTrace();
}
t3.start();
t2.start();*/
/*try
{
	t1.join();
	t2.join();
	t3.join();
}catch(Exception e)
{
	e.printStackTrace();
}

t2.start();
t3.start();*/

}
	}


