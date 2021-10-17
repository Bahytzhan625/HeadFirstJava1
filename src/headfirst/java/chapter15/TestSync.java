package headfirst.java.chapter15;

public class TestSync implements Runnable {
	private int balance;
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 50; i++) {
			increment();
			System.out.println(Thread.currentThread().getName() + " balance is " + balance);
		}

	}

	private void increment() {
		// TODO Auto-generated method stub
		int i = balance;
		balance = i + 1;
	}
}
