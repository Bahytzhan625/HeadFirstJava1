package headfirst.java.chapter15;

public class TestSyncTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSync job = new TestSync();
		Thread a = new Thread(job);
		Thread b = new Thread(job);
		a.setName("Thread A");
		b.setName("Thread B");

		a.start();
		b.start();

	}
}
