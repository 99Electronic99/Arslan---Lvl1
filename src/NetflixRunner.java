

public class NetflixRunner {
	
static Movie MyLittlePony = new Movie("My Little Pony", 5);
static Movie AnimalJam = new Movie("Animal Jam", 3);
static Movie Cameron = new Movie("Cameron",1);
static Movie Nick = new Movie("Nick",4);
static Movie Arslan = new Movie("Arslan",10);

public static void main(String[] args) {
	    MyLittlePony.getTicketPrice();
	    NetflixQueue netflixQueue = new NetflixQueue();
	    netflixQueue.addMovie(MyLittlePony);
	    netflixQueue.addMovie(AnimalJam);
	    netflixQueue.addMovie(Cameron);
	    netflixQueue.addMovie(Nick);
	    netflixQueue.addMovie(Arslan);
	    System.out.println("The best movie is" + Arslan);
	  
	    netflixQueue.sortMoviesByRating();
	    netflixQueue.getMovie(1);
	    System.out.println(netflixQueue.getMovie(1));
}
}
