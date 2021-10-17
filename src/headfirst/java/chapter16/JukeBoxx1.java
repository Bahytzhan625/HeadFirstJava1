package headfirst.java.chapter16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class JukeBoxx1 {
	ArrayList<String> songList = new ArrayList<String>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new JukeBoxv1().go();

	}

	private void go() {
		// TODO Auto-generated method stub
		getSongs();
		System.out.println(songList);

	}

	private void getSongs() {
		// TODO Auto-generated method stub
		try {
			File file = new File("SongList.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;

			while ((line = reader.readLine()) != null) {
				addSong(line);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	private void addSong(String line) {
		// TODO Auto-generated method stub
		String [] tokens = line.split("/");
		songList.add(tokens[0]);
	}

}
