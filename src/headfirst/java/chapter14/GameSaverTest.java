package headfirst.java.chapter14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GameSaverTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GameCharacter one = new GameCharacter(50, "elf", new String[] {"bow", "sword", "dust"});
		GameCharacter two = new GameCharacter(200, "Troll", new String[] {"bare hands", "big ax"});
		GameCharacter three = new GameCharacter(120, "Magician", new String[] {"spells", "invisibility"});

		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
			os.writeObject(one);
			os.writeObject(two);
			os.writeObject(three);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		one = null;
		two = null;
		three = null;
		
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
			GameCharacter oneRestore = (GameCharacter)is.readObject();
			GameCharacter twoRestore = (GameCharacter)is.readObject();
			GameCharacter threeRestore = (GameCharacter)is.readObject();

			System.out.println("One's Type " + oneRestore.getType());
			System.out.println("Two's Type " + twoRestore.getType());
			System.out.println("Three's Type " + threeRestore.getType());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
