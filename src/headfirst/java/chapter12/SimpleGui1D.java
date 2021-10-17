package headfirst.java.chapter12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleGui1D implements ActionListener {
	JFrame frame;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleGui1D gui = new SimpleGui1D();
		gui.go();
	}

	private void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton button = new JButton("Click Me!");
		button.addActionListener(this);

		MyDrawPanel1d drawPanel = new MyDrawPanel1d();

		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.repaint();
	}
}
