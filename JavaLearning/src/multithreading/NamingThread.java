package multithreading;

public class NamingThread extends Thread{

	public static void main(String[] args) throws InterruptedException {
		
		NamingThread t1= new NamingThread();
		NamingThread t2= new NamingThread();
		
		
		t1.start();
		
	    t2.start();
		
		
		
	}
	
	public void run() {
		
		try {
			Thread.sleep(100);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName());
	}

}
