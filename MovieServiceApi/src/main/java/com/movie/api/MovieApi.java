package com.movie.api;

import com.movie.response.MovieResponse;

public interface MovieApi {

    MovieResponse getAllMovies();

    MovieResponse getMovieByTitle();
}
