package example.spring.rest.data.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.spring.rest.data.jpa.entity.Movie;
import example.spring.rest.data.jpa.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {
	@Autowired
	private MovieService movieServ;
	
	@PostMapping
	public void createMovie(@RequestBody Movie m) {
		movieServ.createMovie(m);
	}
	@GetMapping
	public List<Movie> showAllMovies(Movie m) {
		return movieServ.getAllMovies(m);
		
	}
	@GetMapping("/{movieId}")
	public Movie getOneMovie(@PathVariable Integer movieId) {
		return movieServ.getOneMovie(movieId);
		
	}
	@DeleteMapping("/{movieId}")
	public void deleteMovie(@PathVariable Integer movieId) {
		movieServ.deleteMovie(movieId);
	}
	
}
