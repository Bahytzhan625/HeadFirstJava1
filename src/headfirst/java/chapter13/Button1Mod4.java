package headfirst.java.chapter13;

import java.awt.BorderLayout;

import javax.swing.*;

public class Button1Mod4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Button1Mod4 gui = new Button1Mod4();
		gui.go();
	}

	private void go() {
		JFrame frame = new JFrame();

		JButton east = new JButton("East");
		JButton west = new JButton("West");
		JButton north = new JButton("North");
		JButton south = new JButton("South");
		JButton center = new JButton("Center");


		frame.getContentPane().add(BorderLayout.EAST,east);
		frame.getContentPane().add(BorderLayout.WEST,west);
		frame.getContentPane().add(BorderLayout.NORTH,north);
		frame.getContentPane().add(BorderLayout.SOUTH,south);
		frame.getContentPane().add(BorderLayout.CENTER,center);

		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}
