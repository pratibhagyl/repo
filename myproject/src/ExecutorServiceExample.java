import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class ExecutorServiceExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * ExecutorService es=Executors.newSingleThreadExecutor(); 
		 * Set<Callable<String>> callables=new HashSet<Callable<String>>(); 
		 * callables.add(new Callable<String>() { public String call() { return "task1"; }});
		 * callables.add(new Callable<String>() { public String call()throws Exception {
		Thread.sleep(5000); 
		 return "task2"; }}); 
		 callables.add(new Callable<String>()
		 { public String call()throws Exception { return "task3"; }});
		List<Future<String>> futures=es.invokeAll(callables); for(Future<String>
		 *future:futures) { System.out.println(future.get()); 
		 *} es.shutdown();
		 */
		/*
		 * ExecutorService es=Executors.newFixedThreadPool(10); es.execute(new
		 * Runnable() { public void run() { System.out.println("asynchronous task"); }
		 * }); es.shutdown();
		 */
		/*
		 * ExecutorService es=Executors.newFixedThreadPool(10); Future f=es.submit(new
		 * Runnable() { public void run() { System.out.println("asynchronous task"); }
		 * }); System.out.println(f.get()); es.shutdown();
		 */
		ExecutorService es = Executors.newFixedThreadPool(10);
		/*
		 * FutureTask f=new FutureTask(new Callable<String>() { public String call()
		 * throws Exception {while(!f.isCancelled())
		 * {System.out.println("asynchronous task");
		 * 
		 * } return "callable result"; } }); new Thread(f).start(); f.cancel(false);
		 * //System.out.println(f.get()); System.out.println("hello");
		 */
		Future f = es.submit(new Callable<String>() {
			public String call() throws Exception {
				System.out.println("asynchronous task");

				return "callable result";
			}
		});

		System.out.println(f.get());

		es.shutdown();
		/*
		 * ExecutorService es =Executors.newSingleThreadExecutor();
		 * Set<Callable<String>> s=new HashSet<Callable<String>>(); s.add(new
		 * Callable<String>() { public String call() { return "task1"; } }); s.add(new
		 * Callable<String>() { public String call() { return "task2"; } }); s.add(new
		 * Callable<String>() { public String call() { return "task3"; } }); String
		 * result=es.invokeAny(s); System.out.println(result); es.shutdown();
		 */
		/*
		 * ExecutorService es =Executors.newSingleThreadExecutor();
		 * Set<Callable<String>> s=new HashSet<Callable<String>>(); s.add(new
		 * Callable<String>() { public String call() { return "task1"; } }); s.add(new
		 * Callable<String>() { public String call() throws Exception
		 * {Thread.sleep(2000); return "task2"; } }); s.add(new Callable<String>() {
		 * public String call() throws Exception { Thread.sleep(2000); return "task3"; }
		 * }); List<Future<String>> result=es.invokeAll(s);
		 * //System.out.println(result.get()); for(Future<String> futures:result) {
		 * System.out.println(futures.get());
		 * 
		 * }
		 * 
		 * es.shutdown();
		 */
	}

}
