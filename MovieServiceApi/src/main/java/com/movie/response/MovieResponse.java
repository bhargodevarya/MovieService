package com.movie.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class MovieResponse {

    private String title;

    private List<String> genres;

    private Integer year;
}
