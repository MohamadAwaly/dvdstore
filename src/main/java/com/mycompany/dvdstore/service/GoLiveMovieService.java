package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MemoryMovieRepository;

public class GoLiveMovieService implements MovieServiceInterface {
    private MemoryMovieRepository movieRepository;

    public MemoryMovieRepository getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository( MemoryMovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void registerMovie(Movie movie){
        movieRepository.add(movie);
    }
}
