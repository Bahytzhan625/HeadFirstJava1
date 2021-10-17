package headfirst.java.chapter11;

import javax.sound.midi.*;

public class MusicTest2 {
	public void play() {
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("We got Sequencer.");
		} catch (MidiUnavailableException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MusicTest2 mt = new MusicTest2();
		mt.play();
	}
}
