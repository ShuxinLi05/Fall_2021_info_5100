package com.company;

import java.util.Date;
import java.util.GregorianCalendar;

public class Movie {
    String title;
    GregorianCalendar releaseDate;
    String actor;
    String director;

    public Movie(String title, GregorianCalendar releaseDate, String actor, String director){
        this.title = title;
        this.releaseDate = releaseDate;
        this.actor = actor;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GregorianCalendar getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(GregorianCalendar releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

}
