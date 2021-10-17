package headfirst.java.chapter09;

public class Duck1 {
	int size;

	public Duck1() {
		System.out.println("Duck1 is alive QUACK, But size is not set: " + size);
	}

	/*
	@param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
}
