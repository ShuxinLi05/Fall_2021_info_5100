package com.company;

import com.sun.tools.corba.se.idl.Factories;
import com.sun.tools.javah.Gen;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Netflix netflix1 = new Netflix("channel1", "Comedy");

        Netflix netflix = new Netflix("channel2","Action");
        netflix.setGenres(genreGenerate());
        Genre comedy = netflix.getGenre("Comedy");
        addComedy(comedy);
        Genre action = netflix.getGenre("Action");
        addAction(action);
        System.out.println();

        netflix.genres.stream().flatMap(genre -> genre.getMovie().stream())
                .filter(movie -> movie.releaseDate > 1990 && movie.releaseDate < 2000)
                .forEach(movie -> System.out.println(movie.releaseDate) );

        netflix.genres.stream().flatMap(genre -> genre.getMovie().stream())
                .filter(comedy -> comedy1.getName().compareTo(comedy2.getName()))
                .forEach(movie -> System.out.println(movie.releaseDate) );

    }

    private static ArrayList<Genre> genreGenerate(){
        Genre comedy = new Genre("Comedy");
        Genre action = new Genre("Action");

        ArrayList<Genre> list = new ArrayList<>();
        list.add(comedy);
        list.add(action);
        return list;
    }

    private static void addComedy(Genre comedy){
        GregorianCalendar date =  new GregorianCalendar(2000, 5, 20);
        comedy.addMovie(new Movie("comedy1", date, "actor1","director1"));

        date = new GregorianCalendar(1994, 5, 20);
        comedy.addMovie(new Movie("comedy2", date, "actor2", "director2"));
    }

    private static void addAction(Genre action){
        GregorianCalendar date =  new GregorianCalendar(1998, 5, 20);
        action.addMovie(new Movie("action1", date, "actor3","director3"));

        date = new GregorianCalendar(2009, 5, 20);
        action.addMovie(new Movie("action2", date, "actor4", "director4"));
    }
}
