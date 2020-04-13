package multithreading;

public class NotExtedningThreadClass implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		 
		NotExtedningThreadClass etc= new NotExtedningThreadClass();
		NotExtedningThreadClass etc2= new NotExtedningThreadClass();
		
		Thread t1= new Thread(etc);
		Thread t2= new Thread(etc2);
		
		t1.start();
		Thread.sleep(1000);
		t2.start();
		
	}
	
	public void run() {
		
		for(int i =0; i<5; i++)
			System.out.print(i+" ");
	}
	
	

}
