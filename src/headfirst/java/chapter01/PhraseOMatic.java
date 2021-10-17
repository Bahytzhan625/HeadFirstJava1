package headfirst.java.chapter01;

public class PhraseOMatic {
	public static void main(String[] args) {
		// Make three sets of words to choose from.
		// Creating string arrays
		String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B to B", "win-win",
		"front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
		String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered",
		"branded", "outside-the-box", "positioned", "networked", "focussed", "leveraged", "aligned",
		"targeted", "shared", "cooperative", "accelerated"};
		String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency", "strategy",
		"mindshare", "portal", "space", "vision", "paradigm", "mission"};

		// find out how many words are in each list.
		// Java array has a property which will tell its own length.
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		// generate three random numbers.
		int rand1 = (int)(Math.random() * oneLength);
		int rand2 = (int)(Math.random() * twoLength);
		int rand3 = (int)(Math.random() * threeLength);

		// now build a phrase.
		// the + operator concatenates the words.
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

		// print the phrase.
		System.out.println("What we want is a " + phrase);
	}
}
