package com.app.service.api;

import com.movie.response.MovieResponse;

import java.util.List;

public interface MovieService {

    List<MovieResponse> getAllMovies();

    MovieResponse getByTitle(String name);
}
