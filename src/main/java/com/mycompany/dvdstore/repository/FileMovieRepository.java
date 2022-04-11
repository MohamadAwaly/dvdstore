package com.mycompany.dvdstore.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileMovieRepository {
    private MovieRepositoryInterface movieRepositoryInterface;

    @Value("movies.file.location")
    private File file ;

    public void add(){
        FileWriter writer;
        try{
            System.out.printf("Quel est le nom du film");
            Scanner sc = new Scanner(System.in);
            String nom = sc.nextLine();

//            writer=new FileWriter("C:\\temp\\movies.txt",true);
            writer= new FileWriter(file,true);
            writer.write(nom+"\n");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public File getFile() {
        return file;
    }

    public void setFile( File file ) {
        this.file = file;
    }

    public MovieRepositoryInterface getMovieRepositoryInterface() {
        return movieRepositoryInterface;
    }

    public void setMovieRepositoryInterface(
            MovieRepositoryInterface movieRepositoryInterface ) {
        this.movieRepositoryInterface = movieRepositoryInterface;
    }
}
