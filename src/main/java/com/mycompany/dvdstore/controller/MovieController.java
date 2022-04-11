package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class MovieController implements MovieControllerInterface {

    @Autowired
    private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    public void addUsing() {
        System.out.println("what is the movie name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter the genre of the film ");
        String gender = sc.nextLine();
        Movie movie = new Movie();
        movie.setTitel(name);
        movie.setGenre(gender);
        movieService.registerMovie(movie);
    }
}
