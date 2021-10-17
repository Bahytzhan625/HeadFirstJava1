package headfirst.java.chapter11;

import javax.sound.midi.*;

public class MusicTest1 {
	public void play() {
		/* This below line has an error:-
		 * Unhandled exception type MidiUnavailableException
		 */
	//	Sequencer sequencer = MidiSystem.getSequencer();
		System.out.println("We got Sequencer.");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MusicTest1 mt = new MusicTest1();
		mt.play();
	}
}
