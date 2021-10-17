package headfirst.java.chapter12;

import javax.swing.JFrame;

public class SimpleGui1C {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleGui1C gui = new SimpleGui1C();
		gui.go();
	}

	private void go() {
		JFrame frame = new JFrame();
		MyDrawPanel m = new MyDrawPanel();
		frame.getContentPane().add(m);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
