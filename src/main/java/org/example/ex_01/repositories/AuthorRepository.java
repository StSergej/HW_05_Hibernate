package org.example.ex_01.repositories;

import org.example.ex_01.entity.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AuthorRepository {

    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public AuthorRepository(){}

    public Author addAuthor(Author author){
        System.out.println("\nStart of CREATE AUTHOR...");

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(author);

        session.getTransaction().commit();
        session.close();
        return author;

    }
}
