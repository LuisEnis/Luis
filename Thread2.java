package advancedJava;

//it can also be as Thread1 which is extends thread but the reason why it isnt is just to show that if something is inherited first in order to inherit thread too u can make it with implements runnable as java only allows 1 inheritance
public class Thread2 implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("Thread 2 is running");
	
		}
		
		catch (Exception e) {
			System.out.println("Exception raised: "+e);
		}
	}
	
}
