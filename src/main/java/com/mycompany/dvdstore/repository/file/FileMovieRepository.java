package com.mycompany.dvdstore.repository.file;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Repository
public class FileMovieRepository implements MovieRepositoryInterface {
    @Value("${movies.file.location}")
    private File file;

    public void add(Movie movie){
//        System.out.printf("test");
        FileWriter writer;
        try{
            writer=new FileWriter(file,true);
            writer.write(movie.getTitel()+";"+movie.getGenre());
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("The movie "+movie.getTitel()+" has been added.");
//        return movie;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
