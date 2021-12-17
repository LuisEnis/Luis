package advancedJava;

public class Thread1Sync extends Thread {
	
	Synchronization sync;
	
	public Thread1Sync(Synchronization sync) {
		this.sync=sync;
	}
	
	@Override
	public void run() {
		try {
			sync.getMultiples(2);
	
		}
		
		catch (Exception e) {
			System.out.println("Exception raised: "+e);
		}
	}
	

}
