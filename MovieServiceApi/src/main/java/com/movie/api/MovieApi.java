package com.movie.api;

import com.movie.response.MovieResponse;

import java.util.List;

public interface MovieApi {

    List<MovieResponse> getAllMovies();

    MovieResponse getMovieByTitle(String name);
}
