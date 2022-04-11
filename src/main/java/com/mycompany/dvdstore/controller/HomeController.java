package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class HomeController implements MovieControllerInterface {

    @Autowired
    private MovieServiceInterface movieServiceInterface;

    public MovieServiceInterface getMovieServiceInterface() {
        return movieServiceInterface;
    }

    public void setMovieServiceInterface( MovieServiceInterface movieServiceInterface ) {
        this.movieServiceInterface = movieServiceInterface;
    }

    @RequestMapping( "/dvdstore-home" )
    public @ModelAttribute( "movies" ) List<Movie> displayHome() {
        System.out.println( "La méthode display home a était invoqué" );
        return movieServiceInterface.getMovieList();
    }

    @Override public void addUsing() {

    }
}
