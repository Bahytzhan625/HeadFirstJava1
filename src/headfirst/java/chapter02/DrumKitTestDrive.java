package headfirst.java.chapter02;

public class DrumKitTestDrive {
	public static void main(String[] args) {
		Drumkit d = new Drumkit();
		d.playSnare();

		d.snare = false;
		if (d.snare == true) {
			d.playSnare();
		}
		d.playTopHat();
	}
}
