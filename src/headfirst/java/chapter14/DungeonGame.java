package headfirst.java.chapter14;

import java.io.Serializable;

public class DungeonGame implements Serializable {
	public int x = 3;
	transient long y = 4;
	private short z = 5;
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @return the y
	 */
	public long getY() {
		return y;
	}
	/**
	 * @return the z
	 */
	public short getZ() {
		return z;
	}

}
