package synchronization;

public class NonStaticSync {
    
	
	
	
	synchronized void test(int n) {for(int i=0; i <10; i++) {System.out.println(i*n);}}
	public static void main(String[] args) {
	final MultiThreading m=new MultiThreading();
		
	new Thread() {public void run() {m.testRun(5);}}.start();
	new Thread() {public void run() {new NonStaticSync().test(15);}}.start();
    new Thread() {public void run() {m.testRun(10);}}.start();
		
	}
	
 }
