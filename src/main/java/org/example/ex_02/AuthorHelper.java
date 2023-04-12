package org.example.ex_02;

import org.example.ex_02.entity.Author;
import org.example.ex_02.repositories.AuthorRepository;

import java.util.List;

public class AuthorHelper {
    private final AuthorRepository authorRepository;

    public AuthorHelper(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void createAuthor(){

        Author author = new Author("John","Tolkien");
        Author newAuthor = authorRepository.addAuthor(author);

        System.out.println(newAuthor);
        System.out.println("------------------------------------");
    }

    public void readAuthor(){
        Author myAuthor = authorRepository.read(2);

        System.out.println(myAuthor);
        System.out.println("------------------------------------");
    }

    public void deleteAuthor(){
        Author authorToDelete = authorRepository.read(3);
        authorRepository.delete(authorToDelete);

        System.out.println(authorToDelete);
        System.out.println("------------------------------------");
    }

    public void getAll(){
        List<Author> authors = authorRepository.getAllAuthors();

            for(Author authorsAll : authors){
                System.out.println(authorsAll);
            }
        System.out.println("------------------------------------");
        }
}
