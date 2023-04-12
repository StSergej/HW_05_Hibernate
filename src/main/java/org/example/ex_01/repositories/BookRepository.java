package org.example.ex_01.repositories;

import org.example.ex_01.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BookRepository {
    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public BookRepository() {}

    public Book addBook(Book book){
        System.out.println("\nStart of CREATE BOOK...");

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(book);

        session.getTransaction().commit();
        session.close();
        return book;



    }
}
