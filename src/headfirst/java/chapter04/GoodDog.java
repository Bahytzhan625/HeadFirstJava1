package headfirst.java.chapter04;

public class GoodDog {
	private int size;

	/*
	@return the size
	 */
	public int getSize() {
		return size;
	}

	/*
	@param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	void bark() {
		if (size > 60) {
			System.out.println("Wooof! Wooof!");
		} else if (size > 14) {
			System.out.println("Ruff! Ruff!");
		} else {
			System.out.println("Yip! Yip!");
		}
	}
}
