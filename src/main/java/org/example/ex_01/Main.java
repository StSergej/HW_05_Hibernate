package org.example.ex_01;

import org.example.ex_01.repositories.AuthorRepository;
import org.example.ex_01.repositories.BookRepository;


public class Main {
    public static void main(String[] args) {

        AuthorRepository authorRepository = new AuthorRepository();
        AuthorHelper authorHelper = new AuthorHelper(authorRepository);

        BookRepository bookRepository = new BookRepository();
        BookHelper bookHelper = new BookHelper(bookRepository);

        authorHelper.addAuthors();
        System.out.println("------------------------------------");
        bookHelper.addBook();

    }
}
