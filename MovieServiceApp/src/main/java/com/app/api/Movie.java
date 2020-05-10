package com.app.api;

import com.app.service.api.MovieService;
import com.movie.api.MovieApi;
import com.movie.response.MovieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class Movie implements MovieApi {

    @Autowired
    private MovieService movieService;

    @Override
    @GetMapping(value = "/all")
    public List<MovieResponse> getAllMovies() {
        return movieService.getAllMovies();
    }

    @Override
    @RequestMapping("/title/{name}")
    public MovieResponse getMovieByTitle(@PathVariable String name) {
        return movieService.getByTitle(name);
    }
}
