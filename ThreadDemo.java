package advancedJava;

public class ThreadDemo {
	
	public static void main(String [] args) {
		int n=10;
		for (int i=0; i<n; i++) {
			Thread1 t1 = new Thread1();
			t1.start();
			
			
			//This is different from the initialization of t1 because with t2 (Thread2) we have the "implements Runnable" instead of "extends Thread"
			Thread t2 = new Thread( new Thread2());
			t2.start();
			}
 	}

}
