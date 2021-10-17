package headfirst.java.chapter10;

public class Duck3 {
	private int size;
	private static int duckCount=0;

	public Duck3() {
		duckCount++;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize() {
		this.size = size;
	}

	/**
	 * @return the duckCount
	 */
	public static int getDuckCount() {
		return duckCount;
	}
}
