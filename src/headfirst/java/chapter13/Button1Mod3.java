package headfirst.java.chapter13;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button1Mod3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Button1Mod3 gui = new Button1Mod3();
		gui.go();
	}

	private void go() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JButton button = new JButton("There is no spoon.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Font bigFont = new Font("serif", Font.BOLD, 28);
		button.setFont(bigFont);

		frame.getContentPane().add(BorderLayout.NORTH,button);

		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}
