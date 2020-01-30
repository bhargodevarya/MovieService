package com.app.repo;

import com.app.repo.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepo extends MongoRepository<Movie, ObjectId> {

    Movie findByTitle(String name);
}
