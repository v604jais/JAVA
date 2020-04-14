package synchronization;

public class SyncMethod {

	//static method applies lock or monitor on class
	synchronized static void testSynchronized(int n) {

		for (int i = 1; i < 6; i++)
			System.out.println(i*n);
	}
	static void print() {for (int i = 1; i < 6; i++)System.out.println("running...."+i);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		 new Thread() { public void run() { testSynchronized(5);} }.start();

		 new Thread() { public void run() {print();}}.start();
		
	
}
}
