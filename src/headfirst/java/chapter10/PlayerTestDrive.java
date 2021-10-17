package headfirst.java.chapter10;

public class PlayerTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Player Count before init " + Player.playerCount);
		Player one = new Player("Tiger Woods");
		System.out.println("Player Count After init " + Player.playerCount);
	}
}
