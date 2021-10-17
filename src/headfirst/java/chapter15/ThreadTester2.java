package headfirst.java.chapter15;

public class ThreadTester2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable theJob = new MyRunnable2();
		Thread t = new Thread(theJob);

		t.start();

		System.out.println("Back in main.");
	}
}
