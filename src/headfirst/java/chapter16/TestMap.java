package headfirst.java.chapter16;

import java.util.HashMap;

public class TestMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer>scores = new HashMap<String, Integer>();
		scores.put("Kathy", 42);
		scores.put("Bert", 343);
		scores.put("Skyler", 420);

		System.out.println(scores);
		System.out.println(scores.get("Bert"));
	}
}
