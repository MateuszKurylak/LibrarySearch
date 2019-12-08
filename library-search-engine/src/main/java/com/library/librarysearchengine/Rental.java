package com.library.librarysearchengine;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import java.util.ArrayList;

@Component
@PropertySource(value = "classpath:rental.properties")
public class Rental {
    @Value("${rental.status}")
    private Boolean status;             //Wypożyczalnia w trybie online - true lub offline - false
    public Book book;
    ArrayList<Book> lista = new ArrayList<Book>();


    public void addBook(Book book){
    lista.add(book);
    }

    public void SearchBookRequest(String chooseAuthorOrTitle, String name){
        if(chooseAuthorOrTitle.equals("author")){
            for(int i = 0; i <lista.size(); i++){
                if (lista.get(i).getAuthor().equals(name)){
                    System.out.println(lista.get(i));
                };
            }
        }
        if(chooseAuthorOrTitle.equals("title")){
            for(int i = 0; i <lista.size(); i++){
                if (lista.get(i).getTitle().equals(name)){
                    System.out.println(lista.get(i));
                }
            }
        }
    }
}
