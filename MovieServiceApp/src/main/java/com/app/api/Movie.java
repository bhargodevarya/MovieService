package com.app.api;

import com.movie.api.MovieApi;
import com.movie.response.MovieResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Movie implements MovieApi {

    @Override
    @RequestMapping()
    public MovieResponse getAllMovies() {
        return null;
    }

    @Override
    @RequestMapping("/title")
    public MovieResponse getMovieByTitle() {
        return null;
    }
}
