package headfirst.java.chapter06;

import java.util.ArrayList;

public class SimpleDotCom {
	private ArrayList<String> locationCells;
	/*
	@param locationCells the locationCells to set
	 */
	public void setLocationCells(ArrayList<String> locationCells) {
		this.locationCells = locationCells;
	}

	public String checkYourself(String stringGuess) {

		String result = "miss";
		int index = locationCells.indexOf(stringGuess);
		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				result = "kill";
			} else {
				result = "hit";
			}
		}
		System.out.println("Game Result: "+ result);
		return result;
	}
}
