package multithreading;

public class TestJoinMethod3 extends Thread {

	public static void main(String[] args) {

		TestJoinMethod3 t1 = new TestJoinMethod3();
		TestJoinMethod3 t2 = new TestJoinMethod3();

		
		t1.start();
		
		t2.start();
		 
		

	}

	public void run() {

	
			System.out.println(Thread.currentThread().getName());

		}
	}

