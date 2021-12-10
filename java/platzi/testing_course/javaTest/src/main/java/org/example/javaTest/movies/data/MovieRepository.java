package org.example.javaTest.movies.data;

import org.example.javaTest.movies.model.Movie;

import java.util.Collection;
public interface MovieRepository {
    Collection<Movie> findByName(String name);
    Movie findById(long id);
    Collection<Movie> findAll();
    void saveOrUpdate(Movie movie);
}
