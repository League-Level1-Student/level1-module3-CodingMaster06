package netflix;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



import java.util.ArrayList;
import java.util.Collections;

public class NetflixQueue {
	Movie BirdBox = new Movie("Bird Box", 5);
	Movie EndGame = new Movie("End Game", 5);
	Movie HarryPotter7 = new Movie("Harry Potter and the Deathly Hallows", 10000000);
	ArrayList<Movie> movies = new ArrayList<Movie>();
	
	public Movie getBestMovie(){
		this.sortMoviesByRating();
		return movies.get(0);
	}

	public void addMovie(Movie movie) {
		movies.add(movie);
	}
	
	public Movie getMovie(int movieNumber){
		if(movieNumber < movies.size()) 
		return movies.get(movieNumber);
		else System.err.println("That index is larger than the movie queue. Pass a smaller number to the getMovie() method.");
		return null;
	}
	
	public void sortMoviesByRating() {
		Collections.sort(movies);
	}

	public void printMovies() {
		System.out.println("Your Netflix queue contains: ");
		for (Movie movie : movies) {
			System.out.println(movie);
		}
	}
	public void giveBestMovie() {
		System.out.println("The best movie is " + HarryPotter7 + "!");
	}
	public void give2ndBestMovie() {
		System.out.println("The 2nd best movies are " + EndGame + " and "+ BirdBox +"!");
	}
}
