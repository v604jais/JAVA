package multithreading;

public class TestCallRun2 extends Thread {

	public static void main(String[] args) {

		TestCallRun2 t1 = new TestCallRun2();
		TestCallRun2 t2 = new TestCallRun2();
		t1.run();
		t2.run();
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
