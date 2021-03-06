package headfirst.java.chapter16;

public class Song implements Comparable<Song> {
	private String title;
	private String artist;
	private String rating;
	private String bpm;

	Song (String t, String a, String r, String b) {
		title = t;
		artist = a;
		rating = r;
		bpm = b;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}
	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}
	/**
	 * @return the bpm
	 */
	public String getBpm() {
		return bpm;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title;
	}
	@Override
	public int compareTo(Song o) {
		// TODO Auto-generated method stub
		return title.compareTo(o.getTitle());
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return title.hashCode();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Song a = (Song) obj;
		return getTitle().equals(a.getTitle());
	}

}
