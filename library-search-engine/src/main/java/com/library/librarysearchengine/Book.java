package com.library.librarysearchengine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Book {
    public String author;
    public String title;
    public Boolean availability;

public Book(){
}

    Book(String author, String title, Boolean availability){
    this.author = author;
    this.title = title;
    this.availability = availability;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
             

    @Override
    public String toString() {
        return "Book{" +
                "author='" + this.author + '\'' +
                ", title='" + this.title + '\'' +
                ", availability=" + this.availability +
                '}';
    }
}
