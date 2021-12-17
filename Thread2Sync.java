package advancedJava;

public class Thread2Sync implements Runnable {

	
Synchronization sync;
	
	public Thread2Sync(Synchronization sync) {
		this.sync=sync;
	}
	
	@Override
	public void run() {
		try {
			sync.getMultiples(3);
	
		}
		
		catch (Exception e) {
			System.out.println("Exception raised: "+e);
		}
	}
	
}
