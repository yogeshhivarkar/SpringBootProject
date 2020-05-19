package com.springboot.first.api.repository;

import com.springboot.first.api.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer> {


    @Override
    void deleteById(Integer integer);


}
