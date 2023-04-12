package org.example.ex_04;

import org.example.ex_04.repositories.AuthorRepository;
import org.example.ex_04.repositories.BookRepository;

public class Main {
    public static void main(String[] args) {

        AuthorRepository authorRepository = new AuthorRepository();
        AuthorHelper authorHelper = new AuthorHelper(authorRepository);

        BookRepository bookRepository = new BookRepository();
        BookHelper bookHelper = new BookHelper(bookRepository);


        authorHelper.getAuthorAndBook();

        bookHelper.getBookAndAuthor();



    }
}
