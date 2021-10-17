package headfirst.java.chapter16;

import java.util.ArrayList;

public class TestGenericsV3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestGenericsV3().go();
	}

	private void go() {
		// TODO Auto-generated method stub
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		// animals.add(new Cat());
		animals.add(new Dog());

		takeAnimals(animals);

		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());

	//	takeAnimals(dogs);
	}
	private void takeAnimals(ArrayList<Animal> animals) {
		// TODO Auto-generated method stub
		for (Animal animal : animals) {
			/* We can ONLY call the methods declared in type animal. */
			animal.eat();
		}

	}

}
