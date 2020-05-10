package com.app.service;

import com.app.repo.MovieRepo;
import com.app.repo.model.Movie;
import com.app.service.api.MovieService;
import com.movie.response.MovieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MovieServiceImpl implements MovieService {

    private MongoTemplate mongoTemplate;

    private MovieRepo movieRepo;

    @Autowired
    public MovieServiceImpl(MongoTemplate mongoTemplate, MovieRepo movieRepo) {
        this.mongoTemplate = mongoTemplate;
        this.movieRepo = movieRepo;
    }

    @Override
    public List<MovieResponse> getAllMovies() {
        List<Movie> movies = movieRepo.findAll();
        return movies.stream()
                .map(movie -> new MovieResponse(movie.getTitle(), movie.getGenres(),
                            Integer.valueOf(!StringUtils.isEmpty(movie.getYear()) ? movie.getYear() : "0")))
                .collect(Collectors.toList());
    }

    @Override
    public MovieResponse getByTitle(String name) {
        Movie movie = movieRepo.findByTitle(name);
        return new MovieResponse(movie.getTitle(), movie.getGenres(),
                Integer.valueOf(!StringUtils.isEmpty(movie.getYear()) ? movie.getYear() : "0"));
    }
}
