package headfirst.java.chapter09.ConstructorTrial;

public abstract class Animal {
	private String name;

	/*
	@param the name
	 */
	public String getName() {
		return name;
	}

	public Animal (String theName) {
		name = theName;
	}
}
