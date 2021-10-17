package headfirst.java.chapter13;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button1Mod1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Button1Mod1 gui = new Button1Mod1();
		gui.go();
	}

	private void go() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JButton button = new JButton("Click like you mean it.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(BorderLayout.EAST,button);

		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}
