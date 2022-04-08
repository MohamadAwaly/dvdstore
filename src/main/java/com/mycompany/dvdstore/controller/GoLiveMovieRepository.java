package com.mycompany.dvdstore.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GoLiveMovieRepository {
    public void add(){
        FileWriter writer;
        try{
            System.out.printf("Quel est le nom du film");
            Scanner sc = new Scanner(System.in);
            String nom = sc.nextLine();

            writer=new FileWriter("C:\\temp\\movies.txt",true);
            writer.write(nom+"\n");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
