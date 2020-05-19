package com.springboot.first.api.service;

import com.springboot.first.api.model.Movie;
import com.springboot.first.api.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    MovieRepository repository;


public void saveMovie(Movie movie)
{
    repository.save(movie);
}

public String updateMovie(Movie movie)
{
    Movie movie1=new Movie();
    movie1.setMovieId(movie.getMovieId());
    movie1.setMovieName(movie.getMovieName());
    movie1.setEstablishdDate(movie.getEstablishdDate());
    movie1.setReleaseDate(movie.getReleaseDate());
    return "product updated"+repository.save(movie1);


}

public  String deleteMovie(int id)
{
    repository.deleteById(id);

    return "Movie Deleted";

}




}


