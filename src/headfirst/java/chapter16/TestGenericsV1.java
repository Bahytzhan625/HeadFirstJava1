package headfirst.java.chapter16;

import java.util.Iterator;

public class TestGenericsV1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestGenericsV1().go();
	}

	private void go() {
		// TODO Auto-generated method stub
		/* Declare and create an Animal array
		 that holds both dogs and cats. */
		// Animal[] animals = {new Dog(), new Cat(), new Dog()};

		/* Declare nad create a Dog array, that holds only Dogs. */
		Dog[] dogs = {new Dog(), new Dog(), new Dog()};

		/* Call takeAnimals() with both array types. */
		// takeAnimals(animals);
		takeAnimals(dogs);
	}

	/* The critical part is that the takeAnimals() method can take an
	 * Animal[] or a Dog(), since Dog IS-A animal.
	 * Polymorphism in action. */
	private void takeAnimals(Animal[] animals) {
		// TODO Auto-generated method stub
		for (Animal animal : animals) {
			/* We can ONLY call the methods declared in type animal. */
			animal.eat();
		}

	}

}
