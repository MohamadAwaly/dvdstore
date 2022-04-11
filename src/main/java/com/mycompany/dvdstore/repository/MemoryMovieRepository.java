package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MemoryMovieRepository implements MovieRepositoryInterface {

    private List<Movie> movies = new ArrayList<>();

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public void add(Movie movie) {
        movies.add(movie);
        System.out.println("The movie "+movie.getTitel() +" gender: " +  movie.getGenre() + " has been added.");
    }
}
