package example.spring.rest.store;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import example.spring.rest.entity.Movie;

public class MovieCatalog {
	
	public static List<Movie> getAllMovies(){

	List<Movie> allMovies=new ArrayList<>();
	Movie m1= new Movie(101,"Sholay","Action",LocalDate.of(2022, 10, 20));
	Movie m2= new Movie(102,"PK","Comedy",LocalDate.of(2024, 11, 25));
	Movie m3= new Movie(103,"Venom","Thrilling",LocalDate.of(2022, 9, 30));
	
	allMovies.add(m1);
	allMovies.add(m2);
	allMovies.add(m3);
	return allMovies;
	
	}
}
