package org.example.ex_01;

import org.example.ex_01.entity.Book;
import org.example.ex_01.repositories.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class BookHelper{

    private final BookRepository bookRepository;

    public BookHelper(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(){
        List<Book> books = new ArrayList<>();

        books.add(new Book("The Metamorphosis", 1));
        books.add(new Book("David Copperfield", 2));
        books.add(new Book("Moby Dick", 3));

        for(Book newBook : books){
            Book addBook = bookRepository.addBook(newBook);
            System.out.println(addBook);
        }
    }
}
