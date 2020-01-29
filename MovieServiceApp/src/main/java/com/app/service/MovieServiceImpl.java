package com.app.service;

import com.app.repo.MovieRepo;
import com.app.repo.model.Movie;
import com.app.service.api.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private MovieRepo movieRepo;

    @Override
    public List<Movie> getAllMovies() {
        List<Movie> movies = movieRepo.findAll();
        System.out.println("movies size is " + movies.size());
        return movies;
    }
}
