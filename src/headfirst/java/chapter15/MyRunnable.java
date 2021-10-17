package headfirst.java.chapter15;

public class MyRunnable implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		go();

	}

	private void go() {
		// TODO Auto-generated method stub
		doMore();

	}

	private void doMore() {
		// TODO Auto-generated method stub
		System.out.println("Top of the Stack.");

	}
}
