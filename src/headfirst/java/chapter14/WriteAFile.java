package headfirst.java.chapter14;

import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer = new FileWriter("Foo.txt");
			writer.write("hello foo!");
			writer.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
