package headfirst.java.chapter05;

public class SimpleDotCom {
	private int[] locationCells;
	private int numOfHits = 0;
	/*
	@param locationCells the locationCells to set
	 */
	public void setLocationCells(int[] locationCells) {
		this.locationCells = locationCells;
	}

	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";

		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}
		}

		if (numOfHits == locationCells.length) {
			result = "kill";
		}

		System.out.println("Game Result " + result);

		return result;
	}
}
