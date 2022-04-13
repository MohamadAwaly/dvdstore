package com.mycompany.dvdstore.repository.memory;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;

import java.util.ArrayList;
import java.util.List;

//@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {

    private List<Movie> movies = new ArrayList<>();

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies( List<Movie> movies ) {
        this.movies = movies;
    }

    public void add( Movie movie ) {
        movies.add( movie );
        System.out.println( "The movie " + movie.getTitel() + " gender: " + movie.getGenre() + " has been added." );
    }

    @Override
    public List<Movie> list() {
        return movies;
    }

    @Override public Movie getById( long id ) {
        return movies.stream().
                filter( m -> m.getId() == id ).
                findFirst().get();
    }
}
