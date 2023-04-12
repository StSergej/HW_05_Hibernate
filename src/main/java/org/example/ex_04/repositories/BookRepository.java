package org.example.ex_04.repositories;

import org.example.ex_04.entity.BooksEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class BookRepository {
    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    public BookRepository() {}

    public  BooksEntity bookById(int id){

        Session session = sessionFactory.openSession();
        BooksEntity readBookById = session.get(BooksEntity.class, id);

        session.close();
        return readBookById;
    }
}
