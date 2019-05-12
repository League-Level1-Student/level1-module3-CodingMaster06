package netflix;

public class Netflix {
	
public static void main(String[] args) {
	Movie BirdBox = new Movie("Bird Box", 5);
	Movie EndGame = new Movie("End Game", 5);
	Movie HarryPotter7 = new Movie("Harry Potter and the Deathly Hallows", 10000000);
	Movie ByTheSea = new Movie("By The Sea", 0);
	Movie StarWars = new Movie("Star Wars: The Force Awakens", 4);
	HarryPotter7.getTicketPrice();
	NetflixQueue nc = new NetflixQueue();
	nc.addMovie(StarWars);
	nc.addMovie(ByTheSea);
	nc.addMovie(HarryPotter7);
	nc.addMovie(EndGame);
	nc.addMovie(BirdBox);
	nc.printMovies();
	nc.giveBestMovie();
	nc.give2ndBestMovie();
}
}
