package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.GoLiveMovieRepository;
import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.repository.MovieRepository;
import com.mycompany.dvdstore.service.MovieService;

public class App {
    public static void main(String[] args) {
        MovieController movieController = new MovieController();
        MovieService movieService = new MovieService();
        movieController.setMovieService(movieService);
        MovieRepository movieRepository = new MovieRepository();
        movieService.setMovieRepository(movieRepository);
        movieController.addUsingConsole();
//        GoLiveMovieRepository goLiveMovieRepository = new GoLiveMovieRepository();
//        goLiveMovieRepository.add();
    }
}
