package collection;

public class Movie_Example implements Comparable<Movie_Example>{
	private int movieId;
	 private String movieName;
	 private float duration;
	 private float rating;
	 private String director;

	public Movie_Example()
	{
	    
	}

	public Movie_Example(int movieId, String movieName, float duration, float rating, String director) {
	    
	    this.movieId = movieId;
	    this.movieName = movieName;
	    this.duration =duration;
	    this.rating =rating;
	    this.director = director;
	}

	@Override
	public String toString() {
	    return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", duration=" + duration + ", rating=" + rating
	            + ", director=" + director + "]";
	}

	public int getMovieId() {
	    return movieId;
	}

	public void setMovieId(int movieId) {
	    this.movieId = movieId;
	}

	public String getMovieName() {
	    return movieName;
	}

	public void setMovieName(String movieName) {
	    this.movieName = movieName;
	}

	public float getDuration() {
	    return duration;
	}

	public void setDuration(float duration) {
	    this.duration = duration;
	}

	public float getRating() {
	    return rating;
	}

	public void setRating(float rating) {
	    this.rating = rating;
	}

	public String getDirector() {
	    return director;
	}

	public void setDirector(String director) {
	    this.director = director;
	}

	@Override
	public int compareTo(Movie_Example o) {
	    // TODO Auto-generated method stub
	    return Float.compare(rating,o.getRating());
	}





}
