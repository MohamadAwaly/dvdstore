package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.controller.MovieControllerInterface;
import com.mycompany.dvdstore.repository.MemoryMovieRepository;
import com.mycompany.dvdstore.service.DefaultMovieService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        MovieController movieController = new MovieController();
//        DefaultMovieService movieService = new DefaultMovieService();
//        movieController.setMovieService(movieService);
//        MemoryMovieRepository movieRepository = new MemoryMovieRepository();
//        movieService.setMovieRepository(movieRepository);
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MovieControllerInterface movieControllerInterface  = context.getBean( MovieControllerInterface.class );


        movieControllerInterface.addUsing();
//        GoLiveMovieRepository goLiveMovieRepository = new GoLiveMovieRepository();
//        goLiveMovieRepository.add();
    }
}
