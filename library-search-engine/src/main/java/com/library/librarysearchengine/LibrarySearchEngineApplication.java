package com.library.librarysearchengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LibrarySearchEngineApplication{

    public static void main(String[] args) {

        SpringApplication.run(LibrarySearchEngineApplication.class, args);

        Book one = new Book("Harper Lee", "To Kill a Mockingbird", true);
        Book two = new Book("Jane Austen", "Pride and Prejudice", true);
        Book three = new Book("Anne Frank", "The Diary of Anne Frank", false);

        Rental rental = new Rental();
        rental.addBook(one);
        rental.addBook(two);
        rental.addBook(three);

        rental.SearchBookRequest("title","Pride and Prejudice");
        rental.SearchBookRequest("author","Anne Frank");
    }
}
