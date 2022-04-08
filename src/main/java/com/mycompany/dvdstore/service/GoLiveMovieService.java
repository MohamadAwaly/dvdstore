package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepository;

public class GoLiveMovieService implements MovieServiceInterface {
    private MovieRepository movieRepository = new MovieRepository();

    public MovieRepository getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void registerMovie(Movie movie){
        movieRepository.add(movie);
    }
}
