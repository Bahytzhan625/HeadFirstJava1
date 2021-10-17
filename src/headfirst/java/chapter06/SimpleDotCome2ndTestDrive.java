package headfirst.java.chapter06;

import java.util.ArrayList;

public class SimpleDotCome2ndTestDrive {

	/*
	@param args
	 */
	public static void main(String[] args) {
		int numOfGuess = 0;
		GameHelper helper = new GameHelper();
		SimpleDotCom theDotCom = new SimpleDotCom();

		ArrayList<String> locations = new ArrayList<String>();
		locations.add("2");
		locations.add("3");
		locations.add("4");

		theDotCom.setLocationCells(locations);

		boolean isAlive = true;
		while (isAlive == true) {
			String guess = helper.getUserInput("enter a number");
			String result = theDotCom.checkYourself(guess);
			numOfGuess++;

			if (result.equals("kill")) {
				isAlive = false;
				System.out.println("You took: " + numOfGuess + " guess");
			}
		}
	}
}
