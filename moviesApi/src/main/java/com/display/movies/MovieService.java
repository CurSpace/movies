package com.display.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    public List<Mov> allMovies(){
        return movieRepository.findAll();
    }

// we get the id from the Controller
    public Optional<Mov> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);

    }
}
