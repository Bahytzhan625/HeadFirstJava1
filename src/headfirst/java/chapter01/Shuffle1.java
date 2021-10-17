package headfirst.java.chapter01;

public class Shuffle1 {
	public static void main(String[] args) {
		int x = 3;
		while (x > 0) {
			if (x > 2) {
				System.out.println("a");
			}
			x = x - 1;
			System.out.print("-");
			if (x == 2) {
				System.out.print("b c");
			}
			if (x == 1) {
				System.out.println("d");
				x = x - 1;
			}
		}
	}
}
