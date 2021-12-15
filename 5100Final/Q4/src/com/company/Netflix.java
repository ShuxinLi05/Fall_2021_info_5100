package com.company;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Netflix {
    String name;
    ArrayList<Genre> genres;

    public Netflix(String name, ArrayList<String> genre) {
        this.genres = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Genre> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<Genre> genres) {
        this.genres = genres;
    }

    public void addGenre(Genre genre) {
        this.genres.add(genre);
    }

    public Genre getGenre(String genreName) {
        ArrayList<Genre> filter = (ArrayList<Genre>) genres.stream()
                .filter(section -> section.getName().equalsIgnoreCase(genreName))
                .collect(Collectors.toList());
        if (filter.size() == 0) {
            return null;
        }
        return filter.get(0);
    }

}