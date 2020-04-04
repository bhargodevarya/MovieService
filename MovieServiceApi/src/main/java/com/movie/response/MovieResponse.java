package com.movie.response;

import java.util.List;

public class MovieResponse {

    private String title;

    private List<String> genres;

    private Integer year;

    public MovieResponse(String title, List<String> genres, Integer year) {
        this.title = title;
        this.genres = genres;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
