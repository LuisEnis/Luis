package advancedJava;

public class SynchronizationDemo {
	
	public static void main(String [] args) {
	Synchronization syncObj = new Synchronization();
	
	Thread1Sync t1 = new Thread1Sync(syncObj);
	Thread t2 = new Thread(new Thread2Sync(syncObj));
	t1.start();
	t2.start();
	}
}
