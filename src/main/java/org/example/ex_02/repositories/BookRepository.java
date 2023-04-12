package org.example.ex_02.repositories;

import org.example.ex_02.entity.Book;
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

    public Book addBook(Book book){
        System.out.println("\nStart of CREATE...");

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(book);

        session.getTransaction().commit();
        session.close();
        return book;
    }

    public Book readBookByID(int id){
        System.out.println("\nStart of READ...");

        Session session = sessionFactory.openSession();
        Book book = session.get(Book.class, id);

        session.close();
        return book;
    }

    public void delete(Book book){
        System.out.println("\nStart of DELETE...");

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.delete(book);

        session.getTransaction().commit();
        session.close();
    }

    public List<Book> getAllBooks(){
        System.out.println("\nStart of GET_ALL_BOOKS...");
        Session session = sessionFactory.openSession();

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(Book.class);

        Root<Book> root = cq.from(Book.class);
        cq.select(root);

        Query query = session.createQuery(cq);
        List<Book> bookList = query.getResultList();

        session.close();
        return bookList;
    }
}
