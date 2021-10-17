package headfirst.java.chapter13;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel1Mod2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Panel1Mod2 gui = new Panel1Mod2();
		gui.go();
	}

	private void go() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		panel.setBackground(Color.darkGray);
		JButton button = new JButton("Shock Me!");
		JButton button1 = new JButton("Bliss!");

		panel.add(button);
		panel.add(button1);
		frame.getContentPane().add(BorderLayout.EAST,panel);

		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}
