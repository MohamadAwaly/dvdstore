package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class GoLiveMovieService implements MovieServiceInterface {

    @Autowired
    private MovieRepositoryInterface movieRepository;

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository( MovieRepositoryInterface movieRepository ) {
        this.movieRepository = movieRepository;
    }

    public Movie registerMovie(Movie movie){
        movieRepository.add(movie);
        return movie;
    }

    @Override public List<Movie> getMovieList() {
        return null;
    }

    @Override public Movie getMovieById( long id ) {
        return movieRepository.getById( id );
    }

}
