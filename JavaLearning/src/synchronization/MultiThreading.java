package synchronization;

public class MultiThreading {
	
	synchronized void testRun(int n) {
		
		for(int i=0; i<5; i++)
		{
			System.out.println(i*n);
		}
	}

}
