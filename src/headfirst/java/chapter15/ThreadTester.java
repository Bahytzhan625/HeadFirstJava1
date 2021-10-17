package headfirst.java.chapter15;

public class ThreadTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable threadJob = new MyRunnable();
		Thread myThread = new Thread(threadJob);

		myThread.start();
		System.out.println("Back in Main.");

	}
}
