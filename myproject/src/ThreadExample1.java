
 class ThreadExample1 implements Runnable {
	String name;
Thread t;
	public ThreadExample1(String name) {
		this.name = name;
	}

	/*public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(name + "\t" + i);

		}
	}*/
	 public void run() {        
		 //System.out.println(Thread.currentThread().getName());
		 try {            
			 Thread.sleep(4000);        
			 } catch (Exception e) { 
         e.printStackTrace();         }      
		 System.out.println(Thread.currentThread().getName());     } 
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
