package headfirst.java.chapter10;

public class Player {
	static int playerCount = 0;
	private String name;

	public Player(String n) {
		name = n;
		playerCount++;
	}
}
