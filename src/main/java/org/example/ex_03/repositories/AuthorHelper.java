package org.example.ex_03.repositories;

import org.example.ex_03.entity.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AuthorHelper {
    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public void exampleFlush() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        for (int i = 1; i < 201; i++) {
            session.save(new Author("Unknown" + i));

            if (i % 10 == 0) {
                session.flush();
            }
        }
        session.getTransaction().commit();
        session.close();
    }
}
