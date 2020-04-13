package multithreading;

public class TestJoinMethod extends Thread {

	public static void main(String[] args) {

		TestJoinMethod t1 = new TestJoinMethod();
		TestJoinMethod t2 = new TestJoinMethod();
		TestJoinMethod t3 = new TestJoinMethod();

		t1.start();
		try{  
			  t1.join(10000);  
			 }catch(Exception e){System.out.println(e);}  
		 
		t2.start();
		
		t3.start();
		
		
			  
	}

	public void run() {

		for (int i = 0; i < 5; i++) {

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println("running..." + i);

		}
	}
}
