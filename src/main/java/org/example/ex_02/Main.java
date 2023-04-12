package org.example.ex_02;

import org.example.ex_02.repositories.AuthorRepository;
import org.example.ex_02.repositories.BookRepository;

public class Main {
    public static void main(String[] args) {

        AuthorRepository authorRepository = new AuthorRepository();
        AuthorHelper authorHelper = new AuthorHelper(authorRepository);

        BookRepository bookRepository = new BookRepository();
        BookHelper bookHelper = new BookHelper(bookRepository);

        authorHelper.createAuthor();
        bookHelper.createBook();

        authorHelper.readAuthor();
        bookHelper.readBook();

        authorHelper.deleteAuthor();
        bookHelper.deleteBook();

        authorHelper.getAll();
        bookHelper.getAllBook();


    }
}
