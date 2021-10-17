package headfirst.java.chapter13;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Button1 gui = new Button1();
		gui.go();
	}

	private void go() {
		JFrame frame = new JFrame();
		JButton button = new JButton("Click Me");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(BorderLayout.EAST,button);

		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}
