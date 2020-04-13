package multithreading;

public class ExtedningThreadClass extends Thread{

	public static void main(String[] args) throws InterruptedException {
		 
		ExtedningThreadClass etc= new ExtedningThreadClass();
		ExtedningThreadClass etc2= new ExtedningThreadClass();
		etc.start();
		Thread.sleep(1000);
		etc2.start();
		
	}
	
	public void run() {
		
		for(int i =0; i<5; i++)
			System.out.print(i+" ");
	}
	
	

}
