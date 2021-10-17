package headfirst.java.chapter02;

public class Movie {
	String title;
	String genere;
	int rating;

	void playIt() {
		System.out.println("Playing the Movie with details: "
				+ "\n" + "title: " + this.title
				+ "\n" + "genere: " + this.genere
				+ "\n" + "rating: " + this.rating);
	}
}
