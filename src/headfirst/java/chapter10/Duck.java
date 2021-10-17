package headfirst.java.chapter10;

public class Duck {
	private int size;

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* The below line gives a error: Cannot make a static reference to the non-static
		 * field size.
		 */
		// System.out.println("Size of the duck is " + size);
	}
}
