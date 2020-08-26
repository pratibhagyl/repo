class Addition
{
	static int counter=0;
	public static synchronized void add(int value)
	{
		counter+=value;
	}
	public void put()
	{
		System.out.println(counter);
	}
}

class Thread1 extends Thread
{Addition c=null;
public Thread1(Addition c1)
{
	this.c=c1;
}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			Addition.add(i);
		}
		c.put();
	}
}
public class SynchronizedStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition c4=new Addition();
Thread t=new Thread1(c4);
Thread b=new Thread1(c4);
t.start();
b.start();
	}

}
