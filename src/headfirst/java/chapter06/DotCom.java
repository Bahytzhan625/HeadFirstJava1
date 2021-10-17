package headfirst.java.chapter06;

import java.util.*;

public class DotCom {
	private ArrayList<String>locationCells;
	private String name;
	/*
	@param locationCells the locationCells to set
	 */
	public void setLocationCells(ArrayList<String> locationCells) {
		this.locationCells = locationCells;
	}
	/*
	@param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String checkYourself(String userInput) {
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				result = "kill";
				System.out.println("Ouch! you sunk " + name + " ");
			} else {
				result = "hit";
			}
		}
		return result;
	}
}
