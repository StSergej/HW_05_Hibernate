package org.example.ex_02;

import org.example.ex_02.entity.Book;
import org.example.ex_02.repositories.BookRepository;

import java.util.List;

public class BookHelper {
    private final BookRepository bookRepository;

    public BookHelper(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void createBook(){

        Book book = new Book("The Lord of the Rings", 4);
        Book newBook = bookRepository.addBook(book);

        System.out.println(newBook);
        System.out.println("------------------------------------");
    }

    public void readBook(){

        Book readBookByIDBook = bookRepository.readBookByID(2);

        System.out.println(readBookByIDBook);
        System.out.println("------------------------------------");
    }


    public void deleteBook(){
        Book bookToDelete = bookRepository.readBookByID(3);
        bookRepository.delete(bookToDelete);

        System.out.println(bookToDelete);
        System.out.println("------------------------------------");
    }

    public void getAllBook(){
        List<Book> books = bookRepository.getAllBooks();

        for(Book booksAll : books){
            System.out.println(booksAll);
        }
        System.out.println("------------------------------------");
    }
}
