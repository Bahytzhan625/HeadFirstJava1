package headfirst.java.chapter13;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button1Mod2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Button1Mod2 gui = new Button1Mod2();
		gui.go();
	}

	private void go() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JButton button = new JButton("There is no spoon.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(BorderLayout.NORTH,button);

		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}
