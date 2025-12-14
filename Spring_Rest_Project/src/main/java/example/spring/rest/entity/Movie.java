package example.spring.rest.entity;

import java.time.LocalDate;

public class Movie {

	private int movieId;
	private String name;
	private String genr;
	private LocalDate release;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(int movieId, String name, String genr, LocalDate release) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.genr = genr;
		this.release = release;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenr() {
		return genr;
	}
	public void setGenr(String genr) {
		this.genr = genr;
	}
	public LocalDate getRelease() {
		return release;
	}
	public void setRelease(LocalDate release) {
		this.release = release;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", name=" + name + ", genr=" + genr + ", release=" + release + "]";
	}
	
	
}
