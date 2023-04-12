package org.example.ex_04;

import org.example.ex_02.entity.Author;
import org.example.ex_04.entity.AuthorsEntity;
import org.example.ex_04.entity.BooksEntity;
import org.example.ex_04.repositories.AuthorRepository;

import java.util.ArrayList;
import java.util.List;

public class AuthorHelper {
    private final AuthorRepository authorRepository;
    public AuthorHelper(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    public  void getAuthorAndBook() {
        System.out.println("\nStart of getAuthorAndBook().....");
        AuthorsEntity authorsEntity = authorRepository.authorById(2);

        System.out.print("\n" + authorsEntity.getLastName());

        List<BooksEntity> authorAndBook = authorsEntity.getBooks();
        for (BooksEntity books : authorAndBook) {
            System.out.println(" '" + books.getBookName() + "'");
        }
        System.out.println("-------------------------------------");
    }
}
