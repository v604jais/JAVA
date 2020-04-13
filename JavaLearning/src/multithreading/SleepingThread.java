package multithreading;

public class SleepingThread extends Thread{

	public static void main(String[] args) {
		
		SleepingThread st1=new SleepingThread();
		SleepingThread st2=new SleepingThread();
		
		st1.start();
		
		st2.start();
		
		
	}
	
	public void run() {

		int i = 0;

		while (i < 5) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(i);
			i++;
		}
	
	}

}
