package headfirst.java.chapter12;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleAnimation {
	// x, y coordinates of circle
	int x = 70;
	int y = 70;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleAnimation gui = new SimpleAnimation();
		gui.go();

	}
	private void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MyDrawPanel drawPanel = new MyDrawPanel();

		frame.getContentPane().add(drawPanel);
		frame.setSize(300, 300);
		frame.setVisible(true);

		for (int i = 0; i < 130; i++) {
			x++;
			y++;

			drawPanel.repaint(); // ask panel to repaint itself.

			try {
				Thread.sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	class MyDrawPanel extends JPanel {
		public void paintComponent(Graphics g) {
			// clear the previous rectangle first.
			g.setColor(Color.white);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());

			g.setColor(Color.green);
			g.fillOval(x, y, 40, 40);
		}
	}
}
