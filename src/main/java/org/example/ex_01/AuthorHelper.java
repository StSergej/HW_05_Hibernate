package org.example.ex_01;

import org.example.ex_01.entity.Author;
import org.example.ex_01.repositories.AuthorRepository;

import java.util.ArrayList;
import java.util.List;

public class AuthorHelper {

    private final AuthorRepository authorRepository;
    public AuthorHelper(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void addAuthors() {
        List<Author> authors = new ArrayList<>();

        authors.add(new Author("Franz", "Kafka"));
        authors.add(new Author("Charles", "Dickens"));
        authors.add(new Author("Herman", "Melville"));

        for(Author newAuthor : authors){
            Author addAuthor = authorRepository.addAuthor(newAuthor);
            System.out.println(addAuthor);
        }
    }

    public void createAuthor(){

        Author author = new Author("Unknown");
        Author newAuthor = authorRepository.addAuthor(author);
        System.out.println(newAuthor);
    }
}
