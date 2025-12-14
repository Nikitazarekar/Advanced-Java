package example.spring.rest.data.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import example.spring.rest.data.jpa.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{

}
