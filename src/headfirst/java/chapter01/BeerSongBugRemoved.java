package headfirst.java.chapter01;

public class BeerSongBugRemoved {

	public static void main(String[] args) {
		int beerNum = 99;
		String word = "bottles";

		while (beerNum > 0) {

			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer");
			System.out.println("Take one down");
			System.out.println("Pass it around");

			beerNum = beerNum - 1;
			if (beerNum == 1) { // Have to move this if below to get the correct word after decrement
				word = "bottle"; // singular, as in one bottle.
			}
			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall");
				System.out.println();
			} else {
				System.out.println("No more bottles of beer on the wall");
				System.out.println();
			}
		}
	}
}