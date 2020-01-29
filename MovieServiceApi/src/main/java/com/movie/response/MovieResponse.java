package com.movie.response;

import lombok.Getter;

import java.util.List;

@Getter
public class MovieResponse {

    private String title;

    private List<String> genres;

    private Integer year;
}
