package multithreading;

public class TestJoinMethod2 extends Thread {

	public static void main(String[] args) {

		TestJoinMethod2 t1 = new TestJoinMethod2();
		TestJoinMethod2 t2 = new TestJoinMethod2();

		System.out.println("Name of t1:" + t1.getName());
		System.out.println("Name of t2:" + t2.getName());
		System.out.println("id of t1: " + t1.getId());

		t1.start();
		
		t2.start();
		t1.setName("VISHAL JAISWAL");  
		System.out.println("After changing name of t1:"+t1.getName());  
		

	}

	public void run() {

	
			System.out.println("running..." );

		}
	}

