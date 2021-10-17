package headfirst.java.chapter01;

public class Loopy {
	public static void main(String[] args) {
		int x = 1;
		System.out.println("Before the loop.");

		while (x < 4) {
			System.out.println("In the Loop.");
			System.out.println("Value of X, is = " + x);
			x = x + 1;
		}
		System.out.println("This is after the loop.");
	}
}
