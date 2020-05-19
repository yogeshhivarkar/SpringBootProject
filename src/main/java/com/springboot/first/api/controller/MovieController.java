package com.springboot.first.api.controller;

import com.springboot.first.api.model.Movie;
import com.springboot.first.api.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class MovieController {
    @Autowired
    MovieService service;


    @PostMapping("movie/save")
    public  void saveMovie(@RequestBody Movie movie){

        System.out.println("Movie Added");
        service.saveMovie(movie);
    }


    @PutMapping("movie/update")
    public  String updateMovie(@RequestBody  Movie movie)
    {
        return service.updateMovie(movie);
    }
    @DeleteMapping("movie/deleteMovie/{id}")
    public  String deleteMovie(@PathVariable int id)
{
    return service.deleteMovie(id);
}



}
