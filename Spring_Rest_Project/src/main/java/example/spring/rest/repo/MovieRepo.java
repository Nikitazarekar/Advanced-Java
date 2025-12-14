package example.spring.rest.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import example.spring.rest.entity.Movie;
import example.spring.rest.store.MovieCatalog;
@Repository
public class MovieRepo {

	public static List<Movie> getAllMovies(){
		
		return	MovieCatalog.getAllMovies();
		
	}
}
