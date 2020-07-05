package com.stark.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {
//        String sql = "select * from movies where title = ?";
//        List<String> parameters = new ArrayList<String>();
//        parameters.add("Avengers");
//        Record record = new Record();
//
//        Statement firstStatement = new Statement(sql, parameters, record);
//        System.out.println(firstStatement.toString());
//
//        Statement secondStatement = firstStatement.clone();
//        System.out.println(secondStatement.toString());

        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Avengers 2");

        System.out.println(movie.toString());
        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie anotherMovie = (Movie) registry.createItem("Movie");
        movie.setTitle("Avengers 3");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getUrl());
    }
}
