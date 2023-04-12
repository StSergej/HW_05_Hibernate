package org.example.ex_02.repositories;

import org.example.ex_02.entity.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class AuthorRepository {

    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public AuthorRepository(){}

    public Author addAuthor(Author author){
        System.out.println("\nStart of CREATE...");

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(author);

        session.getTransaction().commit();
        session.close();
        return author;
    }

    public Author read(int id){
        System.out.println("\nStart of READ...");

        Session session = sessionFactory.openSession();
        Author readAuthor  = session.get(Author.class, id);

        session.close();
        return readAuthor;
    }

    public void  delete(Author author){
        System.out.println("\nStart of DELETE...");

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.delete(author);

        session.getTransaction().commit();
        session.close();
    }

    public List<Author> getAllAuthors(){
        System.out.println("\nStart of GET_ALL_AUTHORS...");

        Session session = sessionFactory.openSession();

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(Author.class);

        Root<Author> root = cq.from(Author.class);
        cq.select(root);

        Query query = session.createQuery(cq);

        List<Author> authorList = query.getResultList();

        session.close();
        return authorList;
    }
}
