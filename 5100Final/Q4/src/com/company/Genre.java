package com.company;

import com.sun.tools.javah.Gen;

import java.util.ArrayList;

public class Genre {
    String name;
    ArrayList<Movie> movie;


    public Genre(String name){
        this.name = name;
        this.movie = new ArrayList<>(movie);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Movie> getMovie() {
        return movie;
    }

    public void setMovie(ArrayList<Movie> movie) {
        this.movie = movie;
    }

    public void addMovie(Movie movie){
        this.movie.add(movie);
    }
}

