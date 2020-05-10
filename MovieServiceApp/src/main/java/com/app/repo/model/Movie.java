package com.app.repo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(value = "movies")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Movie {

    private ObjectId id;
    private String title;
    private String year;
    private List<String> genres;
}
