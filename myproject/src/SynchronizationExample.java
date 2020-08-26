
public class SynchronizationExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Counter c = new Counter();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					c.incr();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					c.incr();
				}
			System.out.println("finished");
			}
		});
		t1.start();
		t2.start();
t1.join();
t2.join();
		System.out.println(Counter.count);
	}

}

class Counter {
	static int count;

	public static synchronized void incr() {
		//0synchronized (Counter.class) {
//			System.out.println(count);
			count++;
	//	}
	}

}
