package headfirst.java.chapter16;

import java.util.ArrayList;

public class TestGenericsV2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestGenericsV2().go();
	}

	private void go() {
		// TODO Auto-generated method stub
		/* Change Animal[] to ArrayList<Animal> */
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		// animals.add(new Cat());
		animals.add(new Dog());

		takeAnimals(animals);


	}

	/* The method Takes an ArrayList instead of Array. */
	private void takeAnimals(ArrayList<Animal> animals) {
		// TODO Auto-generated method stub
		for (Animal animal : animals) {
			/* We can ONLY call the methods declared in type animal. */
			animal.eat();
		}

	}

}
