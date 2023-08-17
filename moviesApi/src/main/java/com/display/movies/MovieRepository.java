package com.display.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Mov, ObjectId> {
    @Query("{ 'imdbId': ?0 }")

    Optional<Mov> findMovieByImdbId(String imdbId);
}
