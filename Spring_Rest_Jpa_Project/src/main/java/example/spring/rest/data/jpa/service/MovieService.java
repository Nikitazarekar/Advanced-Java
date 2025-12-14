package example.spring.rest.data.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.spring.rest.data.jpa.entity.Movie;
import example.spring.rest.data.jpa.repo.MovieRepository;

@Service
public class MovieService {
@Autowired

	private MovieRepository movieRepo;
	public void createMovie(Movie m) {
		movieRepo.save(m);
	}
	
	public List<Movie> getAllMovies(Movie m){
		return movieRepo.findAll();
		
	}
	
	public Movie getOneMovie(Integer movieId) {
		return movieRepo.findById(movieId).orElse(null);
		
	}
	
	public void deleteMovie(Integer movieId) {
		movieRepo.deleteById(movieId);
	}
}
