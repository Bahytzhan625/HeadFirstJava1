package headfirst.java.chapter12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleGui1B implements ActionListener {
	JButton button;

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		button.setText("I have been Clicked");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleGui1B gui = new SimpleGui1B();
		gui.go();
	}

	public void go() {
		JFrame frame = new JFrame();
		button = new JButton("Click Me!");

		// register your interest with the button
		button.addActionListener(this);

		// Makes the program quit as soon as you close the window.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// add the button to the frame's content pane.
		frame.getContentPane().add(button);

		// give frame a size in pixel.
		frame.setSize(300, 300);

		// make it visible.
		frame.setVisible(true);
	}
}
