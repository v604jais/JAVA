package multithreading;

public class ThreadPriority extends Thread{

	public static void main(String[] args) {
		
		ThreadPriority t1=new ThreadPriority();
		ThreadPriority t2=new ThreadPriority();
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		t1.start();
		t2.start();
		
		
	}
	
	public void run() {
	
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	  System.out.println(Thread.currentThread().getPriority());
	  System.out.println(Thread.currentThread().getName());
	}

}
