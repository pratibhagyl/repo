
public class ThreadExample extends Thread {
	String name;
	Thread t;
public ThreadExample(String name)
{
	this.name=name;
}
public void run()
{
	try
{
	for(int i=0;i<100;i++)
	{
	System.out.println(name+"\t"+i);
	/*if(i==80)
	{
	Thread.sleep(1000);
	}
	else*/ if(i>=10)
	{yield();
	}
}
}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
public void start()
{
	System.out.println(name);
	if(t==null)
	{
		t=new Thread(this,name);
		t.start();
	}
}
}

