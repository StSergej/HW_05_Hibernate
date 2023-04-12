package org.example.ex_04;


import org.example.ex_02.entity.Book;
import org.example.ex_04.entity.AuthorsEntity;
import org.example.ex_04.entity.BooksEntity;
import org.example.ex_04.repositories.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class BookHelper {
    private final BookRepository bookRepository;
    public BookHelper(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void getBookAndAuthor(){

        System.out.println("\nStart of getBookAndAuthor().....");
        BooksEntity booksEntity = bookRepository.bookById(1);

        System.out.println("\n" + "'" + booksEntity.getBookName() + "'"
                + " " + booksEntity.getAuthors().getLastName());

    }
}
