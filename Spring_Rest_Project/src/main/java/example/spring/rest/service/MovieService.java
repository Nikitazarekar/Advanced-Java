package example.spring.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.spring.rest.entity.Movie;
import example.spring.rest.repo.MovieRepo;
@Service
public class MovieService {
@Autowired
	private MovieRepo movieRepo;
	
	public List<Movie> getAllMovies(){
	
		return movieRepo.getAllMovies(); 
	}
}

