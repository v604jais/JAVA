package synchronization;

public class DeadLock {

	public static void main(String[] args) {
		
		final String resource1="VISHAL";
		final String resource2="ANKITA";
		
	Thread t1=new Thread() {
			public void run() {
				synchronized(resource1) {
					
					System.out.println("Thread 1 Locked Resoucre 1");
					 try { Thread.sleep(1000);} catch (Exception e) {}  
					synchronized(resource2) {
						
						System.out.println("Thread 1 Locked Resource2");
						
					}
					
				}
				
			}
		};
		
	Thread t2=	new Thread() {
			public void run() {
				synchronized(resource2) {
					
					System.out.println("Thread 2 : Locked Resource 2");
					 try { Thread.sleep(1000);} catch (Exception e) {}  
					synchronized(resource1) {
						
						System.out.println("Thread 2: Locked Resource 1");
						
					}
					
				}
				
			}
		};
		
		t1.start();
		t2.start();

	}

}
