package multithreading;

public class WorkerThread implements Runnable{

	private String message;

	public WorkerThread(String s) {

		this.message = s;
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
		processMessage();// call processMessage method that sleeps the thread for 2 seconds
		System.out.println(Thread.currentThread().getName() + " (End)");// prints thread name
	}

	
	private void processMessage() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

}
