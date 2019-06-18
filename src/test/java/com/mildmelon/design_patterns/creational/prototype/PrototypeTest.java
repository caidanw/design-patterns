package com.mildmelon.design_patterns.creational.prototype;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

@Slf4j
public class PrototypeTest {

    private Registry registry;

    @Before
    public void setup() {
        registry = new Registry();
    }

    @Test
    public void cloneMovie() {
        Movie movie = (Movie) registry.createItem(ItemType.MOVIE);
        movie.setTitle("Creational Patterns in Java");

        log.info("Movie:");
        log.info(String.valueOf(movie));
        log.info(movie.getUrl());
        log.info(movie.getTitle());
        log.info(movie.getRuntime());

        Movie anotherMovie = (Movie) registry.createItem(ItemType.MOVIE);
        anotherMovie.setTitle("Gang of Four");

        log.info("Another Movie:");
        log.info(String.valueOf(anotherMovie));
        log.info(anotherMovie.getUrl());
        log.info(anotherMovie.getTitle());
        log.info(anotherMovie.getRuntime());
    }

    @Test
    public void cloneBook() {
        Book book = (Book) registry.createItem(ItemType.BOOK);
        book.setTitle("Creational Patterns in Java");

        log.info("Book:");
        log.info(String.valueOf(book));
        log.info(book.getUrl());
        log.info(book.getTitle());
        log.info(String.valueOf(book.getNumberOfPages()));

        Book anotherMovie = (Book) registry.createItem(ItemType.BOOK);
        anotherMovie.setTitle("Gang of Four");

        log.info("Another Book:");
        log.info(String.valueOf(anotherMovie));
        log.info(anotherMovie.getUrl());
        log.info(anotherMovie.getTitle());
        log.info(String.valueOf(anotherMovie.getNumberOfPages()));
    }

}
