package com.movie.common;

import java.util.List;

public class MovieSearchCriteria {

    private List<String> genres;

    public MovieSearchCriteria() {
    }

    public MovieSearchCriteria(List<String> genres) {
        this.genres = genres;
    }

    public List<String> getGenres() {
        return genres;
    }

    public boolean isEmpty() {
        return  genres == null && genres.isEmpty();
    }
}
