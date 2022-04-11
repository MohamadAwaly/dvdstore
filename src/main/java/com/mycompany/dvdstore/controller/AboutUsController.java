package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AboutUsController {


    @RequestMapping("/about-us")
    public String displayFullDetails(){
        System.out.println("Tentative d'affichage de l'a-propos");
        return "index";
    }


}
